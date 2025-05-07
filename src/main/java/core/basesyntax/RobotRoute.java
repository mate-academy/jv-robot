package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int tox = toX - robot.getX();
        int toy = toY - robot.getY();

        Direction directX;
        if (tox > 0) {
            directX = Direction.RIGHT;
        } else if (tox < 0) {
            directX = Direction.LEFT;
        } else {
            directX = null;
        }
        if (directX != null) {
            while (robot.getDirection() != directX) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        Direction directY;
        if (toy > 0) {
            directY = Direction.UP;
        } else if (toy < 0) {
            directY = Direction.DOWN;
        } else {
            directY = null;
        }
        if (directY != null) {
            while (robot.getDirection() != directY) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
