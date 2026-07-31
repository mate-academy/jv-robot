package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();
        if (deltaX > 0) {
            rotateToDirection(robot, Direction.RIGHT);
            for (int i = 0; i < deltaX; i++) {
                robot.stepForward();
            }
        } else if (deltaX < 0) {
            rotateToDirection(robot, Direction.LEFT);
            for (int i = 0; i < -deltaX; i++) {
                robot.stepForward();
            }
        }
        if (deltaY > 0) {
            rotateToDirection(robot, Direction.UP);
            for (int i = 0; i < deltaY; i++) {
                robot.stepForward();
            }
        } else if (deltaY < 0) {
            rotateToDirection(robot, Direction.DOWN);
            for (int i = 0; i < -deltaY; i++) {
                robot.stepForward();
            }
        }
    }

    private static void rotateToDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}
