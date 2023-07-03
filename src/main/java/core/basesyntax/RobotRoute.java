package core.basesyntax;

import java.util.Random;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (!(robot.getX() == toX && robot.getY() == toY)) {
            Direction nextDirection = getNextDirection(robot, toX, toY);
            turnRobotToDirection(robot, nextDirection);
            robot.stepForward();
        }
    }

    private Direction getNextDirection(Robot robot, int toX, int toY) {
        int diffX = toX - robot.getX();
        int diffY = toY - robot.getY();

        if (diffX != 0) {
            return (diffX > 0) ? Direction.RIGHT : Direction.LEFT;
        } else if (diffY != 0) {
            return (diffY > 0) ? Direction.UP : Direction.DOWN;
        }

        return null;
    }

    private void turnRobotToDirection(Robot robot, Direction nextDirection) {
        if (nextDirection == null) {
            return;
        }

        switch (robot.getDirection()) {
            case UP:
                if (nextDirection == Direction.DOWN) {
                    doBackFlip(robot);
                } else if (nextDirection == Direction.LEFT) {
                    robot.turnLeft();
                } else if (nextDirection == Direction.RIGHT) {
                    robot.turnRight();
                }
                break;
            case DOWN:
                if (nextDirection == Direction.UP) {
                    doBackFlip(robot);
                } else if (nextDirection == Direction.LEFT) {
                    robot.turnRight();
                } else if (nextDirection == Direction.RIGHT) {
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (nextDirection == Direction.RIGHT) {
                    doBackFlip(robot);
                } else if (nextDirection == Direction.UP) {
                    robot.turnRight();
                } else if (nextDirection == Direction.DOWN) {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (nextDirection == Direction.LEFT) {
                    doBackFlip(robot);
                } else if (nextDirection == Direction.UP) {
                    robot.turnLeft();
                } else if (nextDirection == Direction.DOWN) {
                    robot.turnRight();
                }
                break;
            default:
                break;
        }
    }

    private void doBackFlip(Robot robot) {
        Random random = new Random();
        if (random.nextBoolean()) {
            robot.turnLeft();
            robot.turnLeft();
        } else {
            robot.turnRight();
            robot.turnRight();
        }
    }
}
