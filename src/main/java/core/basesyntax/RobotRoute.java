package core.basesyntax;

import java.util.Objects;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int stepsX = setDirectionAndStepsX(robot, toX);
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }
        int stepsY = setDirectionAndStepsY(robot, toY);
        for (int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }
    }

    public static int setDirectionAndStepsX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (!Objects.equals(robot.getDirection().toString(), "RIGHT")) {
                robot.turnRight();
            }
        } else {
            while (!Objects.equals(robot.getDirection().toString(), "LEFT")) {
                robot.turnRight();
            }
        }
        return Math.max(robot.getX(), toX) - Math.min(robot.getX(), toX); //  returns amount of steps
    }

    public static int setDirectionAndStepsY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (!Objects.equals(robot.getDirection().toString(), "UP")) {
                robot.turnRight();
            }
        } else {
            while (!Objects.equals(robot.getDirection().toString(), "DOWN")) {
                robot.turnRight();
            }
        }
        return Math.max(robot.getY(), toY) - Math.min(robot.getY(), toY); //  returns amount of steps
    }
}
