package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction direction = robot.getDirection();
        System.out.println(currentX + " " + currentY + " " + toX + " " + toY);

        final boolean moreX = toX > currentX;
        final boolean moreY = toX < currentX;
        final boolean directRight = direction.equals(Direction.RIGHT);
        final boolean directDown = direction.equals(Direction.DOWN);
        final boolean directLeft = direction.equals(Direction.LEFT);
        final boolean directUp = direction.equals(Direction.UP);
        final boolean xMoreDirectRight = moreX && directRight;
        final boolean xMoreDirectDown = moreX && directDown;
        final boolean xMoreDirectLeft = moreX && directLeft;
        final boolean xMoreDirectUp = moreX && directUp;

        final boolean xLessDirectRight = moreY && directRight;
        final boolean xLessDirectDown = moreY && directDown;
        final boolean xLessDirectLeft = moreY && directLeft;
        final boolean xLessDirectUp = moreY && directUp;

        if (xLessDirectRight) {
            robot.turnLeft();
            robot.turnLeft();
            while (toX != currentX) {

                robot.stepForward();
                currentX--;
            }
        }

        if (xLessDirectDown) {
            robot.turnRight();
            while (toX != currentX) {

                robot.stepForward();
                currentX--;
            }
        }

        if (xLessDirectUp) {
            robot.turnLeft();
            while (toX != currentX) {

                robot.stepForward();
                currentX--;
            }
        }

        if (xLessDirectLeft) {
            while (toX != currentX) {
                robot.stepForward();
                currentX--;
            }
        }

        if (xMoreDirectRight) {
            while (toX != currentX) {
                robot.stepForward();
                currentX++;
            }
        }
        if (xMoreDirectDown) {
            robot.turnLeft();
            while (toX != currentX) {
                robot.stepForward();
                currentX++;
            }
        }
        if (xMoreDirectLeft) {
            robot.turnRight();
            robot.turnRight();
            while (toX != currentX) {
                robot.stepForward();
                currentX++;
            }
        }
        if (xMoreDirectUp) {
            robot.turnRight();
            while (toX != currentX) {
                robot.stepForward();
                currentX++;
            }
        }
        final boolean isMoreY = toY > currentY;
        final boolean isLessY = toY < currentY;

        final boolean isYMoreDirectRight = isMoreY && robot.getDirection().equals(Direction.RIGHT);
        final boolean isYMoreDirectDown = isMoreY && robot.getDirection().equals(Direction.DOWN);
        final boolean isYMoreDirectLeft = isMoreY && robot.getDirection().equals(Direction.LEFT);
        final boolean isYMoreDirectUp = isMoreY && robot.getDirection().equals(Direction.UP);

        final boolean isYLessDirectRight = isLessY && robot.getDirection().equals(Direction.RIGHT);
        final boolean isYLessDirectDown = isLessY && robot.getDirection().equals(Direction.DOWN);
        final boolean isYLessDirectLeft = isLessY && robot.getDirection().equals(Direction.LEFT);
        final boolean isYLessDirectUp = isLessY && robot.getDirection().equals(Direction.UP);

        if (isYLessDirectRight) {
            robot.turnRight();
            while (toY != currentY) {

                robot.stepForward();
                currentY--;
            }
        }

        if (isYLessDirectDown) {
            while (toY != currentY) {
                robot.stepForward();
                currentY--;
            }
        }

        if (isYLessDirectUp) {
            robot.turnLeft();
            robot.turnLeft();
            while (toY != currentY) {

                robot.stepForward();
                currentY--;
            }
        }

        if (isYLessDirectLeft) {
            robot.turnLeft();
            while (toY != currentY) {

                robot.stepForward();
                currentY--;
            }
        }

        if (isYMoreDirectRight) {
            robot.turnLeft();
            while (toY != currentY) {

                robot.stepForward();
                currentY++;
            }
        }
        if (isYMoreDirectDown) {
            robot.turnLeft();
            robot.turnLeft();
            while (toY != currentY) {
                robot.stepForward();
                currentY++;
            }
        }
        if (isYMoreDirectLeft) {
            robot.turnRight();
            while (toY != currentY) {
                robot.stepForward();
                currentY++;
            }
        }
        if (isYMoreDirectUp) {
            while (toY != currentY) {
                robot.stepForward();
                currentY++;
            }
        }
        System.out.println(robot.getX() + " " + robot.getY() + " " + toX + " " + toY);
    }
}
