package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        moveRobotByX(robot, toX);
        moveRobotByY(robot, toY);

    }

    private void moveRobotByX (Robot robot, int toX) {
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP: {
                    robot.turnRight();
                    break;
                }
                case DOWN: {
                    robot.turnLeft();
                    break;
                }
                case LEFT: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
                default: {
                    break;
                }
            }
        } else if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case UP: {
                    robot.turnLeft();
                    break;
                }
                case DOWN: {
                    robot.turnRight();
                    break;
                }
                case RIGHT: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
                default: {
                    break;
                }
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    private void moveRobotByY (Robot robot, int toY) {
        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case LEFT: {
                    robot.turnRight();
                    break;
                }
                case RIGHT: {
                    robot.turnLeft();
                    break;
                }
                case DOWN: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
                default: {
                    break;
                }
            }
        } else if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case LEFT: {
                    robot.turnLeft();
                    break;
                }
                case RIGHT: {
                    robot.turnRight();
                    break;
                }
                case UP: {
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                }
                default: {
                    break;
                }
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

}
