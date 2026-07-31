package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();
        Direction directionX = dx > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = dy > 0 ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != directionY) {
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
