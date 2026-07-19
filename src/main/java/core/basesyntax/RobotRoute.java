package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongAxis(robot, toX - robot.getX(), Direction.RIGHT, Direction.LEFT);
        moveAlongAxis(robot, toY - robot.getY(), Direction.UP, Direction.DOWN);
    }

    private void moveAlongAxis(Robot robot, int distance, Direction positiveDirection,
                                Direction negativeDirection) {
        if (distance == 0) {
            return;
        }
        Direction targetDirection = distance > 0 ? positiveDirection : negativeDirection;
        turnToDirection(robot, targetDirection);
        for (int i = 0; i < Math.abs(distance); i++) {
            robot.stepForward();
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
