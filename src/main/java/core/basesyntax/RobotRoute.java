package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = robot.getX() - toX;
        int distanceY = robot.getY() - toY;

        if (distanceX != 0) {
            Direction directionX = distanceX > 0 ? Direction.LEFT : Direction.RIGHT;

            while (directionX != robot.getDirection()) {
                robot.turnLeft();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (distanceY != 0) {
            Direction directionY = distanceY > 0 ? Direction.DOWN : Direction.UP;

            while (directionY != robot.getDirection()) {
                robot.turnRight();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
