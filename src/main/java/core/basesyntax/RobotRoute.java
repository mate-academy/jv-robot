package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        checkDirectionX(robot, toX);
        moveToX(robot, toX);
        checkDirectionY(robot, toY);
        moveToY(robot, toY);
    }

    private void checkDirectionX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        } else if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
    }

    private void moveToX(Robot robot, int toX) {
        if (robot.getX() != toX) {
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
    }

    private void checkDirectionY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        } else if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
    }

    private void moveToY(Robot robot, int toY) {
        if (robot.getY() != toY) {
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}



