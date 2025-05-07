package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        this.moveRobotX(robot, toX);
        this.moveRobotY(robot, toY);
    }

    private void moveRobotX(Robot robot, int toX) {

        int steps = Math.abs(robot.getX() - toX);
        Direction direction = robot.getDirection();

        if (robot.getX() > toX) {
            switch (direction) {
                case UP: {
                    robot.turnLeft();
                    break;
                }
                case RIGHT: {
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                }
                case DOWN: {
                    robot.turnRight();
                    break;
                }
                default:
                    break;
            }

        } else if (robot.getX() < toX) {
            switch (direction) {
                case UP: {
                    robot.turnRight();
                    break;
                }
                case LEFT: {
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                }
                case DOWN: {
                    robot.turnLeft();
                    break;
                }
                default:
                    break;
            }
        }

        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    private void moveRobotY(Robot robot, int toY) {

        int steps = Math.abs(robot.getY() - toY);
        Direction direction = robot.getDirection();

        if (robot.getY() > toY) {
            switch (direction) {
                case RIGHT: {
                    robot.turnRight();
                    break;
                }
                case UP: {
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                }
                case LEFT: {
                    robot.turnLeft();
                    break;
                }
                default:
                    break;
            }

        } else if (robot.getY() < toY) {
            switch (direction) {
                case RIGHT: {
                    robot.turnLeft();
                    break;
                }
                case DOWN: {
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                }
                case LEFT: {
                    robot.turnRight();
                    break;
                }
                default:
                    break;
            }
        }

        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
