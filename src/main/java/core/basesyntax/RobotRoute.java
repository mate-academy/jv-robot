package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int targetX = toX - robot.getX();
        int targetY = toY - robot.getY();

        // Step to X
        if (targetX != 0) {
            Direction directionX = targetX > 0 ? Direction.RIGHT : Direction.LEFT;
            turnToDirection(robot, directionX);
            moveForward(robot, Math.abs(targetX));
        }

        // Step to Y
        if (targetY != 0) {
            Direction directionY = targetY > 0 ? Direction.UP : Direction.DOWN;
            turnToDirection(robot, directionY);
            moveForward(robot, Math.abs(targetY));
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    private void moveForward(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
