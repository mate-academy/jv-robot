package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        if (currentX == toX && currentY == toY) {
            return;
        }
        if (currentX < toX) {
            checkDirection(robot, Direction.RIGHT);
            for (int pos = currentX; pos < toX; pos++) {
                robot.stepForward();
            }
        }
        if (currentX > toX) {
            checkDirection(robot, Direction.LEFT);
            for (int pos = currentX; pos > toX; pos--) {
                robot.stepForward();
            }
        }
        if (currentY < toY) {
            checkDirection(robot, Direction.UP);
            for (int pos = currentY; pos < toY; pos++) {
                robot.stepForward();
            }
        }
        if (currentY > toY) {
            checkDirection(robot, Direction.DOWN);
            for (int pos = currentY; pos > toY; pos--) {
                robot.stepForward();
            }
        }
    }

    public void turnRobot(Robot robot, Direction direction) {
        if (robot.getDirection() == direction) {
            return;
        }
        switch (direction) {
            case UP, LEFT:
                robot.turnLeft();
                break;
            case DOWN, RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
        turnRobot(robot, direction);
    }

    public void checkDirection(Robot robot, Direction direction) {
        if (robot.getDirection() != direction) {
            turnRobot(robot, direction);
        }
    }
}
