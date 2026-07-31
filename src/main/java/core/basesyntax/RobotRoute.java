package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX > x) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            for (int i = x; i < toX; i++) {
                robot.stepForward();
            }
        } else if (toX < x) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = x; i > toX; i--) {
                robot.stepForward();
            }
        }
        if (toY < y) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = y; i > toY; i--) {
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = y; i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}
