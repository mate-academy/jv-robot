package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction robotXDirection = toX < robot.getX() ? Direction.LEFT : Direction.RIGHT;
        Direction robotYDirection = toY < robot.getY() ? Direction.DOWN : Direction.UP;

        while (toX != robot.getX()) {
            if (robotXDirection == robot.getDirection()) {
                robot.stepForward();
            } else {
                robot.turnLeft();
            }
        }

        while (toY != robot.getY()) {
            if (robotYDirection == robot.getDirection()) {
                robot.stepForward();
            } else {
                robot.turnRight();
            }
        }
    }
}
