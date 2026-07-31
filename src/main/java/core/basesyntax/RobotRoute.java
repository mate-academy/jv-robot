package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int diffX = toX - robot.getX();
        int diffY = toY - robot.getY();
        if (diffX != 0) {
            Direction directionX = (diffX > 0) ? Direction.RIGHT : Direction.LEFT;
            while (robot.getDirection() != directionX) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (diffY != 0) {
            Direction directionY = (diffY > 0) ? Direction.UP : Direction.DOWN;
            while (robot.getDirection() != directionY) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
