package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int xdelta = toX - currentX;
        int ydelta = toY - currentY;

        if (xdelta != 0) {
            Direction targetXDirection;
            if (xdelta > 0) {
                targetXDirection = Direction.RIGHT;
            } else {
                targetXDirection = Direction.LEFT;
            }

            while (robot.getDirection() != targetXDirection) {
                robot.turnRight();
            }

            int stepsX = Math.abs(xdelta);
            for (int i = 0; i < stepsX; i++) {
                robot.stepForward();
            }
        }

        if (ydelta != 0) {
            Direction targetYDirection;

            if (ydelta > 0) {
                targetYDirection = Direction.UP;
            } else {
                targetYDirection = Direction.DOWN;
            }
            while (robot.getDirection() != targetYDirection) {
                robot.turnRight();
            }

            int stepsY = Math.abs(ydelta);
            for (int i = 0; i < stepsY; i++) {
                robot.stepForward();
            }
        }
    }
}
