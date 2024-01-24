package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int deltaX = toX - currentX;
        int deltaY = toY - currentY;

        while (deltaX != 0) {
            if (deltaX > 0) {
                turnRobotToDirection(robot, Direction.RIGHT);
                robot.stepForward();
                deltaX--;
            } else {
                turnRobotToDirection(robot, Direction.LEFT);
                robot.stepForward();
                deltaX++;
            }
        }

        while (deltaY != 0) {
            if (deltaY > 0) {
                turnRobotToDirection(robot, Direction.UP);
                robot.stepForward();
                deltaY--;
            } else {
                turnRobotToDirection(robot, Direction.DOWN);
                robot.stepForward();
                deltaY++;
            }
        }
    }

    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnLeft();
        }
    }
}
