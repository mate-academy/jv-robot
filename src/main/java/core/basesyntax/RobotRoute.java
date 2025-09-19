package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        rotateToDirection(robot, robot.getX(), toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }

        rotateToDirection(robot, toX, robot.getY());
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void rotateToDirection(Robot robot, int toX, int toY) {
        Direction target = getRotationToD(robot, toX, toY);
        while (target != null && robot.getDirection() != target) {
            robot.turnRight();
        }
    }

    public Direction getRotationToD(Robot robot, int toX, int toY) {
        int dy = toY - robot.getY();
        int dx = toX - robot.getX();

        if (dx > 0) {
            return Direction.RIGHT;
        }
        if (dx < 0) {
            return Direction.LEFT;
        }
        if (dy > 0) {
            return Direction.UP;
        }
        if (dy < 0) {
            return Direction.DOWN;
        }

        return null;
    }
}
