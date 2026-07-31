package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction targetXDirection = null;

        if (toX > robot.getX()) {
            targetXDirection = Direction.RIGHT;
        }

        if (toX < robot.getX()) {
            targetXDirection = Direction.LEFT;
        }

        if (targetXDirection != null) {
            while (robot.getDirection() != targetXDirection) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        Direction targetYDirection = null;

        if (toY > robot.getY()) {
            targetYDirection = Direction.UP;
        }

        if (toY < robot.getY()) {
            targetYDirection = Direction.DOWN;
        }

        if (targetYDirection != null) {
            while (robot.getDirection() != targetYDirection) {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}

