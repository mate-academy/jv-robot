package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (isRobotAtDestination(robot, toX, toY)) {
            return;
        }
        turnRobot(robot, getHorizontalDirection(robot.getX(), toX));
        int steps = getStepsNumber(toX, robot.getX());
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
        turnRobot(robot, getVerticalDirection(robot.getY(), toY));
        steps = getStepsNumber(toY, robot.getY());
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    private boolean isRobotAtDestination(Robot robot, int toX, int toY) {
        return robot.getX() == toX && robot.getY() == toY;
    }

    private Direction getHorizontalDirection(int position, int target) {
        return position > target ? Direction.LEFT : Direction.RIGHT;
    }

    private Direction getVerticalDirection(int position, int target) {
        return position > target ? Direction.DOWN : Direction.UP;
    }

    private int getStepsNumber(int position, int destination) {
        return Math.abs(destination - position);
    }

    private void turnRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnLeft();
        }
    }
}
