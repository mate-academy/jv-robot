package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int fromX = robot.getX();
        int fromY = robot.getY();

        int deltaX = toX - fromX;
        int deltaY = toY - fromY;

        if (deltaX > 0) {
            turnAndMove(robot, Direction.RIGHT, Math.abs(deltaX));
        } else if (deltaX < 0) {
            turnAndMove(robot, Direction.LEFT, Math.abs(deltaX));
        }

        if (deltaY > 0) {
            turnAndMove(robot, Direction.UP, Math.abs(deltaY));
        } else if (deltaY < 0) {
            turnAndMove(robot, Direction.DOWN, Math.abs(deltaY));
        }
    }

    private void turnAndMove(Robot robot, Direction direction, int steps) {
        Direction currentDirection = robot.getDirection();

        while (currentDirection != direction) {
            robot.turnRight();
            currentDirection = robot.getDirection();
        }

        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
