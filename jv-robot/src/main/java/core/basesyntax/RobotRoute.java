package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        int dx = x - toX;
        int dy = y - toY;

        Direction horizontalDirection = (dx > 0) ? Direction.LEFT : Direction.RIGHT;
        Direction verticalDirection = (dy > 0) ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != horizontalDirection) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != verticalDirection) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
