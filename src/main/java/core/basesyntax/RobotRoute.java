package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction startDirection = robot.getDirection();
        setXPosition(robot, toX);
        setYPosition(robot, toY);
        setToDirection(robot, startDirection);
    }

    private void setXPosition(Robot robot, int toX) {
        if (robot.getX() > toX) {
            setToDirection(robot, Direction.LEFT);
        } else {
            setToDirection(robot, Direction.RIGHT);
        }
        int countSteps = Math.abs(robot.getX() - toX);
        for (int i = 0; i < countSteps; i++) {
            robot.stepForward();
        }
    }

    private void setYPosition(Robot robot, int toY) {
        if (robot.getY() > toY) {
            setToDirection(robot, Direction.DOWN);
        } else {
            setToDirection(robot, Direction.UP);
        }
        int countSteps = Math.abs(robot.getY() - toY);
        for (int i = 0; i < countSteps; i++) {
            robot.stepForward();
        }
    }

    private void setToDirection(Robot robot, Direction direction) {
        if (robot.getDirection() == Direction.UP) {
            if (direction == Direction.LEFT) {
                robot.turnLeft();
            }
            if (direction == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (robot.getDirection() == Direction.DOWN) {
            if (direction == Direction.LEFT) {
                robot.turnRight();
            }
            if (direction == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        if (robot.getDirection() == Direction.LEFT) {
            if (direction == Direction.UP) {
                robot.turnRight();
            }
            if (direction == Direction.DOWN) {
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        if (robot.getDirection() == Direction.RIGHT) {
            if (direction == Direction.UP) {
                robot.turnLeft();
            }
            if (direction == Direction.DOWN) {
                robot.turnRight();
            }
            if (direction == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
        }
    }

}
