package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int x = robot.getX();
        final int y = robot.getY();
        Direction direction = robot.getDirection();

        if (x > toX) {
            switch (direction) {
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
        } else if (x < toX) {
            switch (direction) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }

        direction = robot.getDirection();

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (y > toY) {
            switch (direction) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
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
        } else if (y < toY) {
            switch (direction) {
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
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

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
