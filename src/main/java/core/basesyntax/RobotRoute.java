package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                robot.turnLeft();
                while (robot.getY() > toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnRight();
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX > robot.getX()) {
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                robot.turnRight();
                while (robot.getY() > toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnLeft();
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }
        } else if (toX == robot.getX()) {
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                while (robot.getY() > toY) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (robot.getY() < toY) {
                    robot.stepForward();
                }
            }
        }
    }
}

