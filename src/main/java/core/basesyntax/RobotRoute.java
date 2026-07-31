package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = toX - robot.getX();
        int distanceY = toY - robot.getY();
        if (distanceX != 0) {
            Direction directionX = (distanceX > 0) ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != directionX) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (distanceY != 0) {
            Direction directionY = (distanceY > 0) ? Direction.UP : Direction.DOWN;
            while (robot.getDirection() != directionY) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
