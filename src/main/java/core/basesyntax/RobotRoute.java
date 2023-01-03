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
        Direction XStepDirection = null;
        Direction YStepDirection = null;
        if (robot.getX() - toX != 0) {
            XStepDirection = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        }
        if (robot.getY() - toY != 0) {
            YStepDirection = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        }
        System.out.println("Robot can move " + XStepDirection + " and " + YStepDirection);
        return new Direction[]{XStepDirection, YStepDirection};
    }

    public static void turnRobotToRightDirection(Robot robot, int toX, int toY) {
        Direction[] directions = getDirections(robot, toX, toY);
        Direction XDirection = directions[0];
        Direction YDirection = directions[1];
        Random random = new Random();
        switch (robot.getDirection()) {
            case UP:
                if (YDirection == Direction.UP) {
                    break;
                } else if (XDirection == Direction.LEFT) {
                    robot.turnLeft();
                } else if (XDirection == Direction.RIGHT) {
                    robot.turnRight();
                } else if (YDirection == Direction.DOWN) {
                    doBackFlip(robot);
                }
                break;
            case DOWN:
                if (YDirection == Direction.DOWN) {
                    break;
                } else if (XDirection == Direction.LEFT) {
                    robot.turnRight();
                } else if (XDirection == Direction.RIGHT) {
                    robot.turnLeft();
                } else if (YDirection == Direction.UP) {
                    doBackFlip(robot);
                }
                break;
            case LEFT:
                if (XDirection == Direction.LEFT) {
                    break;
                } else if (YDirection == Direction.UP) {
                    robot.turnRight();
                } else if (YDirection == Direction.DOWN) {
                    robot.turnLeft();
                } else if (XDirection == Direction.RIGHT) {
                    doBackFlip(robot);
                }
                break;
            case RIGHT:
                if (XDirection == Direction.RIGHT) {
                    break;
                } else if (YDirection == Direction.UP) {
                    robot.turnLeft();
                } else if (YDirection == Direction.DOWN) {
                    robot.turnRight();
                } else if (XDirection == Direction.LEFT) {
                    doBackFlip(robot);
                }
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
