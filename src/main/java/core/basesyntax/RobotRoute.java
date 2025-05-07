package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX != x) {
            moveX(robot, toX);
        }
        if (toY != y) {
            moveY(robot, toY);
        }
    }

    private void moveX(Robot robot, int toX) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        if (x < toX) {
            switch (direction) {
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
            while (x < toX) {
                robot.stepForward();
                x++;
            }

        } else if (x > toX) {
            switch (direction) {
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
            while (x > toX) {
                robot.stepForward();
                x--;
            }
        }
    }

    private void moveY(Robot robot, int toY) {
        Direction direction = robot.getDirection();
        int y = robot.getY();
        if (y < toY) {
            switch (direction) {
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
            while (y < toY) {
                robot.stepForward();
                y++;
            }
        } else if (y > toY) {
            switch (direction) {
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
            while (y > toY) {
                robot.stepForward();
                y--;
            }
        }
    }
}
