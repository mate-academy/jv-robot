package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int xStep = 0;
        int yStep = 0;
        if (robot.getX() < toX) {
            xStep = toX - (robot.getX());
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (xStep > 0) {
                robot.stepForward();
                xStep--;
            }
        }
        if (robot.getX() > toX) {
            xStep = robot.getX() - (toX);
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (xStep > 0) {
                robot.stepForward();
                xStep--;
            }
        }
        if (robot.getY() < toY) {
            yStep = toY - (robot.getY());
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (yStep > 0) {
                robot.stepForward();
                yStep--;
            }
        }
        if (robot.getY() > toY) {
            yStep = robot.getY() - (toY);
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (yStep > 0) {
                robot.stepForward();
                yStep--;
            }

        }
    }
}


