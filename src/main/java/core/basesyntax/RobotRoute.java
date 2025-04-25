package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        if (deltaX != 0) {
            Direction desiredXDir = deltaX > 0 ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != desiredXDir) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(deltaX); i++) {
                robot.stepForward();
            }
        }

        if (deltaY != 0) {
            Direction desiredYDir = deltaY > 0 ? Direction.UP : Direction.DOWN;
            while (robot.getDirection() != desiredYDir) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(deltaY); i++) {
                robot.stepForward();
            }
        }
    }
}
