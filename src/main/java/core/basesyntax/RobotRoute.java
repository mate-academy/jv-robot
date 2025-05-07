package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction robotDirection;
        if (toY != robot.getY()) {
            robotDirection = toY - robot.getY() > 0 ? Direction.UP : Direction.DOWN;
            while (robot.getDirection() != robotDirection) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        if (toX != robot.getX()) {
            robotDirection = toX - robot.getX() > 0 ? Direction.RIGHT : Direction.LEFT;

            while (robot.getDirection() != robotDirection) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

    }
}
