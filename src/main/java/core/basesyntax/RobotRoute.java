package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction needDirection;

        if (toX != robot.getX()) {
            needDirection = toX - robot.getX() > 0 ? Direction.RIGHT : Direction.LEFT;

            while (robot.getDirection() != needDirection) {
                robot.turnLeft();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY != robot.getY()) {
            needDirection = toY - robot.getY() > 0 ? Direction.UP : Direction.DOWN;

            while (robot.getDirection() != needDirection) {
                robot.turnRight();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
