package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotHorizontal(robot, toX);
        moveRobotVertical(robot, toY);
    }

    private void moveRobotVertical(Robot robot, int toY) {
        int fromY = robot.getY();
        Direction verticalDirection = fromY - toY > 0 ? Direction.DOWN : Direction.UP;

        turnRobotTo(robot, verticalDirection);
        makeRobotNSteps(robot, Math.abs(fromY - toY));
    }

    private void moveRobotHorizontal(Robot robot, int toX) {
        int fromX = robot.getX();
        Direction horizontalDirection = fromX - toX > 0 ? Direction.LEFT : Direction.RIGHT;

        turnRobotTo(robot, horizontalDirection);
        makeRobotNSteps(robot, Math.abs(fromX - toX));
    }

    private void turnRobotTo(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void makeRobotNSteps(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
