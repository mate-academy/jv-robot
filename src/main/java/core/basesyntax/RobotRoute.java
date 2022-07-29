package core.basesyntax;

public class RobotRoute {
    private boolean isOppositeDirectionX(Robot robot, Direction moveToDirectionX) {
        if (robot.getDirection() == Direction.LEFT && moveToDirectionX == Direction.RIGHT)
            return true;

        if (robot.getDirection() == Direction.RIGHT && moveToDirectionX == Direction.LEFT)
            return true;

        return false;
    }

    private boolean isOppositeDirectionY(Robot robot, Direction moveToDirectionY) {
        if (robot.getDirection() == Direction.UP && moveToDirectionY == Direction.DOWN)
            return true;

        if (robot.getDirection() == Direction.DOWN && moveToDirectionY == Direction.UP)
            return true;

        return false;
    }

    private void turnToDirectionY(Robot robot, Direction directionToY) {
        if (robot.getDirection() == Direction.LEFT) {
            if (directionToY == Direction.UP) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        if (robot.getDirection() == Direction.RIGHT) {
            if (directionToY == Direction.UP) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
    }

    private void turnToDirectionX(Robot robot, Direction directionToX) {
        if (robot.getDirection() == Direction.UP) {
            if (directionToX == Direction.LEFT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        if (robot.getDirection() == Direction.DOWN) {
            if (directionToX == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
    }

    private void turnToNeededDirection(Robot robot, int toX, int toY) {
        Direction directionToX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        Direction directionToY = robot.getY() > toY ? Direction.DOWN : Direction.UP;

        if (isOppositeDirectionX(robot, directionToX) || robot.getX() == toX) {
            turnToDirectionY(robot, directionToY);
        } else if (isOppositeDirectionY(robot, directionToY) || robot.getY() == toY) {
            turnToDirectionX(robot, directionToY);
        }
    }

    private void moveToCoordinate(Robot robot, int toX, int toY) {
        int steps = (robot.getDirection() == Direction.LEFT || robot.getDirection() == Direction.RIGHT)
                ? toX - robot.getX()
                : toY - robot.getY();

        for (int i = 0; i < Math.abs(steps); i++) {
            robot.stepForward();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        while (!(robot.getX() == toX && robot.getY() == toY)) {
            turnToNeededDirection(robot, toX, toY);
            moveToCoordinate(robot, toX, toY);
        }
    }
}
