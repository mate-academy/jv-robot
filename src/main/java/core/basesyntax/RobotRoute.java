package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            robot.turnRight();
        }
        if (robot.getX() > toX && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
        }
        if (robot.getX() > toX && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }
        if (robot.getX() > toX && robot.getDirection() == Direction.LEFT) {
            for (int i = robot.getX(); i > toX; i--) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.RIGHT) {
            for (int i = robot.getX(); i < toX; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.UP) {
            for (int i = robot.getY(); i < toY; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.UP) {
            robot.turnRight();
            robot.turnRight();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.DOWN) {
            for (int i = robot.getY(); i > toY; i--) {
                robot.stepForward();
            }
        }
    }
}
