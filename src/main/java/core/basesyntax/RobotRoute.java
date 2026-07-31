package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = toX - robot.getX();
        int distanceY = toY - robot.getY();
        if (distanceX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX - robot.getX() != 0) {
                robot.stepForward();
            }
        }
        if (distanceX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (toX - robot.getX() != 0) {
                robot.stepForward();
            }
        }
        if (distanceY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (toY - robot.getY() != 0) {
                robot.stepForward();
            }
        }
        if (distanceY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (toY - robot.getY() != 0) {
                robot.stepForward();
            }
        }
    }
}
