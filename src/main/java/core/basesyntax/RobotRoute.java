package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirect = robot.getDirection();
        boolean isAtTarget = isAtTargetPosition(robot, toX, toY);

        if (isAtTarget) {
            return;
        }
        moveToY(robot, toY);
        moveToX(robot, toX);
    }

    private boolean isAtTargetPosition(Robot robot, int toX, int toY) {
        return robot.getX() == toX && robot.getY() == toY;
    }

    private void moveToYGreaterZero(Robot robot, int currentY, int toY) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
        }

        while (currentY < toY) {
            robot.stepForward();
            currentY++;
        }
    }

    private void moveToYLessZero(Robot robot, int currentY, int toY) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }

        while (currentY > toY) {
            robot.stepForward();
            currentY--;
        }
    }

    private void moveToY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            moveToYGreaterZero(robot, robot.getY(), toY);
        } else {
            moveToYLessZero(robot, robot.getY(), toY);
        }
    }

    private void moveToXGreaterZero(Robot robot, int currentX, int toX) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnLeft();
        }

        while (currentX < toX) {
            robot.stepForward();
            currentX++;
        }
    }

    private void moveToXLessZero(Robot robot, int currentX, int toX) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }

        while (currentX > toX) {
            robot.stepForward();
            currentX--;
        }
    }

    private void moveToX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            moveToXGreaterZero(robot, robot.getX(), toX);
        } else {
            moveToXLessZero(robot, robot.getX(), toX);
        }
    }
}
