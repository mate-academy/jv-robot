package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // x route
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            goToX(robot,toX);
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            goToX(robot,toX);
        }
        // y route
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            goToY(robot,toY);
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            goToY(robot,toY);
        }
    }

    // while x is not reached go forward
    public void goToY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    // while y is not reached go forward
    public void goToX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
