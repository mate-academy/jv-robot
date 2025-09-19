package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        RotateToDirection(robot, robot.getX(), toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }

        RotateToDirection(robot, toX, robot.getY());
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void RotateToDirection(Robot robot, int toX, int toY) {
        Direction target = GetRotationToD(robot, toX, toY);
        while (target != null && robot.getDirection() != target) {
            robot.turnRight();
        }
    }

    public Direction GetRotationToD(Robot robot, int toX, int toY) {
        int DY = toY - robot.getY();
        int DX = toX - robot.getX();

        if (DX > 0) {
            return Direction.RIGHT;
        }
        if (DX < 0) {
            return Direction.LEFT;
        }
        if (DY > 0) {
            return Direction.UP;
        }
        if (DY < 0) {
            return Direction.DOWN;
        }

        return null;
    }
}
