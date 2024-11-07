package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() < toX) {
            robot.turnRight();
            while (robot.getX() < toX) {
                robot.stepForward();
            }
            robot.turnLeft();
        } else if (robot.getX() > toX) {
            robot.turnLeft();
            while (robot.getX() > toX) {
                robot.stepForward();
            }
            robot.turnRight();
        }

        if (robot.getY() < toY) {
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            robot.turnRight();
            robot.turnRight();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
            robot.turnLeft();
            robot.turnLeft();
        }
    }
}
