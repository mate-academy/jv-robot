package core.basesyntax;

import org.jetbrains.annotations.NotNull;

public class RobotRoute {

    public void moveRobot(@NotNull Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() < toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getX() > toX) {
            if (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }
    }
}
