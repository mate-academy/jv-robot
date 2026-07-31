package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            int deltaX = toX - robot.getX();
            int deltaY = toY - robot.getY();

            Direction targetDirection = robot.getDirection();

            if (deltaX > 0) {
                targetDirection = Direction.RIGHT;
            } else if (deltaX < 0) {
                targetDirection = Direction.LEFT;
            } else if (deltaY > 0) {
                targetDirection = Direction.UP;
            } else if (deltaY < 0) {
                targetDirection = Direction.DOWN;
            }
            turnRobotToDirection(robot, targetDirection);

            robot.stepForward();
        }
    }

    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
