package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (shouldMove(robot.getX(), toX)) {
            if (robot.getX() > toX) {
                switchToLeftDown(robot, Direction.LEFT);
            } else {
                switchToRightUp(robot, Direction.RIGHT);
            }
            while (shouldMove(robot.getX(), toX)) {
                robot.stepForward();
            }
        }
        if (shouldMove(robot.getY(), toY)) {
            if (robot.getY() > toY) {
                switchToLeftDown(robot, Direction.DOWN);
            } else {
                switchToRightUp(robot, Direction.UP);
            }
            while (shouldMove(robot.getY(), toY)) {
                robot.stepForward();
            }
        }
    }

    private void switchToRightUp(Robot robot, Direction rightOrUp) {
        while (robot.getDirection() != rightOrUp) {
            robot.turnRight();
        }
    }

    private void switchToLeftDown(Robot robot, Direction leftOrDown) {
        while (robot.getDirection() != leftOrDown) {
            robot.turnLeft();
        }
    }

    private boolean shouldMove(int point, int pointTo) {
        return point != pointTo;
    }
}
