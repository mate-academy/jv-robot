package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() == toY && robot.getX() == toX) {
            return;
        }
        Direction directionX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        Direction directionY = robot.getY() > toY ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != directionX) {
            robot.turnLeft();
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
