package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX > currentX) {
            rotateTo(robot, Direction.RIGHT);
            for (int i = 0; i < toX - currentX; i++) {
                robot.stepForward();
            }
        } else if (toX < currentX) {
            rotateTo(robot, Direction.LEFT);
            for (int i = 0; i < currentX - toX; i++) {
                robot.stepForward();
            }
        }

        if (toY > currentY) {
            rotateTo(robot, Direction.UP);
            for (int i = 0; i < toY - currentY; i++) {
                robot.stepForward();
            }
        } else if (toY < currentY) {
            rotateTo(robot, Direction.DOWN);
            for (int i = 0; i < currentY - toY; i++) {
                robot.stepForward();
            }
        }
    }

    private void rotateTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
git