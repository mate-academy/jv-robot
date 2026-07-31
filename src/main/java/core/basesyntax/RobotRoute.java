package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        int deltaX = robot.getX() - toX;
        int deltaY = robot.getY() - toY;

        Direction dirX = null;
        Direction dirY = null;

        if (deltaX != 0) {
            dirX = deltaX > 0 ? Direction.LEFT : Direction.RIGHT;
        }

        if (deltaY != 0) {
            dirY = deltaY > 0 ? Direction.UP : Direction.DOWN;
        }

        if (dirX != null) {
            while (robot.getDirection() != dirX) {
                robot.turnLeft();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (dirY != null) {
            while (robot.getDirection() != dirY) {
                robot.turnLeft();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
