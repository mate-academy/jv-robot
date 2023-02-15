package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX = (robot.getX() - toX > 0) ? Direction.LEFT : Direction.RIGHT;
        Direction directionY = (robot.getY() - toY > 0) ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != directionY) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
