package core.basesyntax;

public class RobotRoute {
    private static int stepsX;
    private static int stepsY;

    public void moveRobot(Robot robot, int toX, int toY) {
        turnXRobot(robot, toX);
        moveXRobot(robot, toX);
        turnYRobot(robot, toY);
        moveYRobot(robot, toY);
    }

    public void turnXRobot(Robot robot, int toX) {
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        } else if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
    }

    public void moveXRobot(Robot robot, int toX) {
        stepsX = Math.abs(robot.getX() - toX);
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }
    }

    public void turnYRobot(Robot robot, int toY) {
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        } else if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
    }

    public void moveYRobot(Robot robot, int toY) {
        stepsY = Math.abs(robot.getY() - toY);
        for (int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }
    }
}
