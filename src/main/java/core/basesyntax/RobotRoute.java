package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX > x) {
            if (robot.getDirection() == Direction.LEFT) {
                robot = new Robot(Direction.RIGHT, robot.getX(), robot.getY());
            }
            for (int i = x; i < toX; i++) {
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.RIGHT) {
                robot = new Robot(Direction.LEFT, robot.getX(), robot.getY());
            }
            for (int i = x; i > toX; i--) {
                robot.stepForward();
            }
        }
        if (toY < y) {
            robot = new Robot(Direction.DOWN, robot.getX(), robot.getY());
            for (int i = y; i > toY; i--) {
                robot.stepForward();
            }
        } else {
            robot = new Robot(Direction.UP, robot.getX(), robot.getY());
            for (int i = y; i <= toY; i++) {
                robot.stepForward();
            }
        }
    }
}
