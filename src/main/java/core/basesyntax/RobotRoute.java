package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveByAxis(robot, toX, robot.getX(), Direction.RIGHT, Direction.LEFT);

        moveByAxis(robot, toY, robot.getY(), Direction.UP, Direction.DOWN);
    }

    private void moveByAxis(Robot robot, int targetCoordinate, int currentCoordinate,
                            Direction positiveDirection, Direction negativeDirection) {

        int distance = targetCoordinate - currentCoordinate;

        if (distance > 0) {
            turnTo(robot, positiveDirection);
            performSteps(robot, distance);
        } else if (distance < 0) {
            turnTo(robot, negativeDirection);
            performSteps(robot, Math.abs(distance));
        }
    }

    private void turnTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnLeft();
        }
    }

    private void performSteps(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
