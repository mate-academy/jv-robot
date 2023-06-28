package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        goOnX(robot, toX);
        goOnY(robot, toY);
    }

    private void goOnX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            turnOnTarget(robot, Direction.LEFT);
        } else if (robot.getX() < toX) {
            turnOnTarget(robot, Direction.RIGHT);
        }
        goToTarget(robot, robot.getX() - toX);
    }

    private void goOnY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            turnOnTarget(robot, Direction.DOWN);
        } else if (robot.getY() < toY) {
            turnOnTarget(robot, Direction.UP);
        }
        goToTarget(robot, robot.getY() - toY);
    }

    private void turnOnTarget(Robot robot, Direction direction) {
        Direction robotDirection = robot.getDirection();
        if (direction == Direction.UP && robotDirection == Direction.LEFT
                || direction == Direction.LEFT && robotDirection == Direction.DOWN
                || direction == Direction.DOWN && robotDirection == Direction.RIGHT
                || direction == Direction.RIGHT && robotDirection == Direction.UP) {
            turnRight(robot, direction);
        } else {
            turnLeft(robot, direction);
        }
    }

    private void turnRight(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private void turnLeft(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void goToTarget(Robot robot, int steps) {
        if (steps < 0) {
            steps *= -1;
        }
        for (int i = steps; i > 0; i--) {
            robot.stepForward();
        }
    }
}
