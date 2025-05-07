package core.basesyntax;

import static java.lang.Math.abs;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot == null) {
            return;
        }
        if (robot.getX() != toX) {
            changeDirection(robot, robot.getX() > toX ? Direction.LEFT : Direction.RIGHT);
            int steps = abs(robot.getX() - toX);
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            changeDirection(robot, robot.getY() > toY ? Direction.DOWN : Direction.UP);
            int steps = abs(robot.getY() - toY);
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }
    }

    public void changeDirection(Robot robot, Direction newDirection) {
        if (robot == null || robot.getDirection() == newDirection) {
            return;
        }
        if (robot.getDirection() == Direction.UP) {
            if (newDirection == Direction.RIGHT) {
                robot.turnRight();
            } else if (newDirection == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (robot.getDirection() == Direction.DOWN) {
            if (newDirection == Direction.RIGHT) {
                robot.turnLeft();
            } else if (newDirection == Direction.LEFT) {
                robot.turnRight();
            } else {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (robot.getDirection() == Direction.RIGHT) {
            if (newDirection == Direction.UP) {
                robot.turnLeft();
            } else if (newDirection == Direction.DOWN) {
                robot.turnRight();
            } else {
                robot.turnRight();
                robot.turnRight();
            }
        } else if (robot.getDirection() == Direction.LEFT) {
            if (newDirection == Direction.UP) {
                robot.turnRight();
            } else if (newDirection == Direction.DOWN) {
                robot.turnLeft();
            } else {
                robot.turnRight();
                robot.turnRight();
            }
        }
    }
}
