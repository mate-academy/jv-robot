package core.basesyntax;

import java.util.Random;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (!(robot.getX() == toX && robot.getY() == toY)) {
            turnRobotToRightDirection(robot, toX, toY);
            robot.stepForward();
        }
    }

    public static Direction[] getDirections(Robot robot, int toX, int toY) {
        Direction stepDirectionX = null;
        Direction stepDirectionY = null;
        if (robot.getX() - toX != 0) {
            stepDirectionX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        }
        if (robot.getY() - toY != 0) {
            stepDirectionY = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        }
        return new Direction[]{stepDirectionX, stepDirectionY};
    }

    public static void turnRobotToRightDirection(Robot robot, int toX, int toY) {
        Direction[] directions = getDirections(robot, toX, toY);
        Direction directionX = directions[0];
        Direction directionY = directions[1];
        Random random = new Random();
        switch (robot.getDirection()) {
            case UP:
                if (directionY == Direction.UP) {
                    break;
                } else if (directionX == Direction.LEFT) {
                    robot.turnLeft();
                } else if (directionX == Direction.RIGHT) {
                    robot.turnRight();
                } else if (directionY == Direction.DOWN) {
                    doBackFlip(robot);
                }
                break;
            case DOWN:
                if (directionY == Direction.DOWN) {
                    break;
                } else if (directionX == Direction.LEFT) {
                    robot.turnRight();
                } else if (directionX == Direction.RIGHT) {
                    robot.turnLeft();
                } else if (directionY == Direction.UP) {
                    doBackFlip(robot);
                }
                break;
            case LEFT:
                if (directionX == Direction.LEFT) {
                    break;
                } else if (directionY == Direction.UP) {
                    robot.turnRight();
                } else if (directionY == Direction.DOWN) {
                    robot.turnLeft();
                } else if (directionX == Direction.RIGHT) {
                    doBackFlip(robot);
                }
                break;
            case RIGHT:
                if (directionX == Direction.RIGHT) {
                    break;
                } else if (directionY == Direction.UP) {
                    robot.turnLeft();
                } else if (directionY == Direction.DOWN) {
                    robot.turnRight();
                } else if (directionX == Direction.LEFT) {
                    doBackFlip(robot);
                }
                break;
            default:
                break;
        }
    }

    public static void doBackFlip(Robot robot) {
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
