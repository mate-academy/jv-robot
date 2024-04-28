package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        int currentX = robot.getX();
        int currentY = robot.getY();

        int deltaX = toX - currentX;
        int deltaY = toY - currentY;

        Direction targetDirection = calculateDirection(deltaX, deltaY);

        while (robot.getDirection() != targetDirection) {
            if (robot.getDirection().ordinal() < targetDirection.ordinal()) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX || robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private Direction calculateDirection(int deltaX, int deltaY) {
        if (deltaX > 0) {
            return Direction.RIGHT;
        } else if (deltaX < 0) {
            return Direction.LEFT;
        } else if (deltaY > 0) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }

    }
}
