package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        defineDirectionX(robot, toX);
        startMovingToX(robot, toX);
        defineDirectionY(robot, toY);
        startMovingToY(robot, toY);
    }

    private void startMovingToX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void startMovingToY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void defineDirectionX(Robot robot, int endX) {
        if (robot.getX() < endX) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
        if (robot.getX() > endX) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
    }

    private void defineDirectionY(Robot robot, int endY) {
        if (robot.getY() < endY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
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
        if (robot.getY() > endY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
    }
}
