package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int steps = 0;
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            steps = robot.getX() - toX;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        } else if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            steps = toX - robot.getX();
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            steps = robot.getY() - toY;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        } else if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            }
            steps = toY - robot.getY();
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }
    }
}

