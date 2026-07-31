package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            setDirectionX(robot, toX);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            setDirectionY(robot, toY);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    public void setDirectionX(Robot robot, int x) {
        Direction direction = robot.getDirection();
        if (robot.getX() < x) {
            if (direction != Direction.RIGHT) {
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
        } else {
            if (robot.getDirection() != Direction.LEFT) {
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
            }
        }
    }

    public void setDirectionY(Robot robot, int y) {
        Direction direction = robot.getDirection();
        if (robot.getY() < y) {
            if (direction != Direction.UP) {
                switch (direction) {
                    case LEFT:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
        } else {
            if (direction != Direction.DOWN) {
                switch (direction) {
                    case LEFT:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                    case UP:
                        robot.turnLeft();
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
