package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int xDelta = toX - currentX;
        int yDelta = toY - currentY;

        if (xDelta != 0) {
            Direction targetXdirection;
            if (xDelta > 0) {
                targetXdirection = Direction.RIGHT;
            } else {
                targetXdirection = Direction.LEFT;
            }
            while (robot.getDirection() != targetXdirection) {
                robot.turnRight();
            }

            int stepsX = Math.abs(xDelta);
            for (int i = 0; i < stepsX; i++) {
                robot.stepForward();
            }
        }

        if (yDelta != 0) {
            Direction targetYdirection;

            if (yDelta > 0) {
                targetYdirection = Direction.UP;
            } else {
                targetYdirection = Direction.DOWN;
            }
            while (robot.getDirection() != targetYdirection) {
                robot.turnRight();
            }
            int stepsY = Math.abs(yDelta);
            for (int i = 0; i < stepsY; i++) {
                robot.stepForward();
            }
        }
    }
}
