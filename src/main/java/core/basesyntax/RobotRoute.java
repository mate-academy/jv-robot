package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction coordinateXDirection = toX < robot.getX() ? Direction.LEFT : Direction.RIGHT;
        Direction coordinateYDirection = toY < robot.getY() ? Direction.DOWN : Direction.UP;

        while (toX != robot.getX()) {
            if (coordinateXDirection == robot.getDirection()) {
                robot.stepForward();
            } else {
                robot.turnLeft();
            }
        }

        while (toY != robot.getY()) {
            if (coordinateYDirection == robot.getDirection()) {
                robot.stepForward();
            } else {
                robot.turnRight();
            }
        }
    }
}
