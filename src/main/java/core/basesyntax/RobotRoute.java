package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int numberOfstepsX = 0;
        int numberOfstepsY = 0;
        if (robot.getX() < 0) {
            numberOfstepsX = toX + robot.getX();
        }
        if (robot.getX() == 0 || robot.getX() > 0) {
            numberOfstepsX = toX - robot.getX();
        }
        if (robot.getY() < 0) {
            numberOfstepsY = toY + robot.getY();
        }
        if (robot.getY() == 0 || robot.getY() > 0) {
            numberOfstepsY = toY - robot.getY();
        }
        while (robot.getX() < toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getX() > toX) {
            if (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }
    }
}
