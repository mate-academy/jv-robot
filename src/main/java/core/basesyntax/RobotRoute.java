package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            moveToX(robot, toX);
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            moveToX(robot, toX);
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            moveToY(robot, toY);
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            moveToY(robot, toY);
        }
    }

    public static void moveToX(Robot robot, int x) {
        if (robot.getX() < x) {
            while (robot.getX() < x) {
                robot.stepForward();
            }
        } else if (robot.getX() > x) {
            while (robot.getX() > x) {
                robot.stepForward();
            }
        }
    }

    public static void moveToY(Robot robot, int y) {
        if (robot.getY() < y) {
            while (robot.getY() < y) {
                robot.stepForward();
            }
        } else if (robot.getY() > y) {
            while (robot.getY() > y) {
                robot.stepForward();
            }
        }
    }
}
