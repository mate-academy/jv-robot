package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        if (deltaX > 0) {
            turnToDirection(robot, Direction.RIGHT);
            moveForward(robot, deltaX);
        } else if (deltaX < 0) {
            turnToDirection(robot, Direction.LEFT);
            moveForward(robot, -deltaX);
        }

        if (deltaY > 0) {
            turnToDirection(robot, Direction.UP);
            moveForward(robot, deltaY);
        } else if (deltaY < 0) {
            turnToDirection(robot, Direction.DOWN);
            moveForward(robot, -deltaY);
        }
    }

    private void turnToDirection(Robot robot,Direction targetDirection) {
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
