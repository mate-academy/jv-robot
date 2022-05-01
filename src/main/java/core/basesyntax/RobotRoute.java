package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = 0;
        int y = 0;
        if (robot.getX() < toX) {
            x = toX - (robot.getX());
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (x > 0) {
                robot.stepForward();
                x--;
            }
        }
        if (robot.getX() > toX) {
            x = robot.getX() - (toX);
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (x > 0) {
                robot.stepForward();
                x--;
            }
        }
        if (robot.getY() < toY) {
            y = toY - (robot.getY());
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (y > 0) {
                robot.stepForward();
                y--;
            }
        }
        if (robot.getY() > toY) {
            y = robot.getY() - (toY);
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (y > 0) {
                robot.stepForward();
                y--;
            }

        }
    }
}


