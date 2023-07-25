package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnRobotToTargetHorizontalDirection(robot, toX);
        moveRobotToTarget(robot, toX, toY);
        turnRobotToTargetVerticalDirection(robot, toY);
        moveRobotToTarget(robot, toX, toY);
    }

    private void moveRobotToTarget(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        if (currentX != toX) {
            while (currentX != toX) {
                robot.stepForward();
                currentX = robot.getX();
            }
            return;
        }
        int currentY = robot.getY();
        while (currentY != toY) {
            robot.stepForward();
            currentY = robot.getY();
        }
    }

    private void turnRobotToTargetHorizontalDirection(Robot robot, int toX) {
        int deltaX = toX - robot.getX();
        if (deltaX == 0) {
            return;
        }
        Direction targetX = deltaX > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction current = robot.getDirection();
        if (current == targetX) {
            return;
        }
        switch (current) {
            case UP: {
                if (targetX == Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            }
            case DOWN:
                if (targetX == Direction.RIGHT) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            default: {
                turnHalfTurn(robot);
            }
        }
    }

    private void turnRobotToTargetVerticalDirection(Robot robot, int toY) {
        int deltaY = toY - robot.getY();
        if (deltaY == 0) {
            return;
        }
        Direction targetY = deltaY > 0 ? Direction.UP : Direction.DOWN;
        Direction current = robot.getDirection();
        if (current == targetY) {
            return;
        }
        switch (current) {
            case RIGHT: {
                if (targetY == Direction.UP) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            }
            case LEFT:
                if (targetY == Direction.UP) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            default: {
                turnHalfTurn(robot);
            }
        }
    }

    private void turnHalfTurn(Robot robot) {
        final int movesNumber = 2;
        for (int i = 0; i < movesNumber; i++) {
            robot.turnRight();
        }
    }
}
