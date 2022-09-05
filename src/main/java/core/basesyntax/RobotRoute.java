package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX > x) {
            if (robot.getDirection() == Direction.LEFT) {
                new Robot(Direction.RIGHT, x, y);
            }
            for (int i = x; i <= toX; i++) {
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.RIGHT) {
                new Robot(Direction.LEFT, x, y);
            }
            for (int i = x; i >= toX; i--) {
                robot.stepForward();
            }
        }
        if (toY < y) {
            new Robot(Direction.DOWN, toX, y);
            for (int i = y; i >= toY; i--) {
                robot.stepForward();
            }
        } else {
            new Robot(Direction.UP, toX, y);
            for (int i = y; i <= toY; i++) {
                robot.stepForward();
            }
        }
    }
}
