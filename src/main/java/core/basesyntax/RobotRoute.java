package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX > robot.getX()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            for (int i = 0;i < toX - x;i++) {
                robot.stepForward();
            }
        }
        if (toX < robot.getX()) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            for (int i = 0;i < x - toX;i++) {
                robot.stepForward();
            }
        }
        if (toY > robot.getY()) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = 0;i < toY - y;i++) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0;i < y - toY;i++) {
                robot.stepForward();
            }
        }
    }
}
