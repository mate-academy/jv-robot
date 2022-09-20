package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        if (toX < x) {
            while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
            }
            for (int i = x; i > toX; i--) {
                    robot.stepForward();
            }
        } else if (toX > x) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = x; i < toX; i++) {
                robot.stepForward();
            }
        }
        if (toY < y) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = y; i > toY; i--) {
                robot.stepForward();
            }
        } else if (toY > y) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = y; i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}
