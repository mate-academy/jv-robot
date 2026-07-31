package core.basesyntax;

public class RobotRoute {

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    turnToRight(robot);
                }
            } else {
                if (robot.getDirection() != Direction.LEFT) {
                    turnToLeft(robot);
                }
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    turnToUp(robot);
                }
            } else {
                if (robot.getDirection() != Direction.DOWN) {
                    turnToDown(robot);
                }
            }
            robot.stepForward();
        }
    }

    private static void turnToRight(Robot robot) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
    }

    private static void turnToLeft(Robot robot) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
    }

    private static void turnToUp(Robot robot) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
    }

    private static void turnToDown(Robot robot) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }
    }
}
