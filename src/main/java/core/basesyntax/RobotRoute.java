package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX < toX) {
            ensureDirection(robot, Direction.RIGHT);
        } else if (currentX > toX) {
            ensureDirection(robot, Direction.LEFT);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (currentY < toY) {
            ensureDirection(robot, Direction.UP);
        } else if (currentY > toY) {
            ensureDirection(robot, Direction.DOWN);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void ensureDirection(Robot robot, Direction desiredDirection) {
        if (robot.getDirection() == desiredDirection) {
            return;
        }

        Direction current = robot.getDirection();
        Direction leftTurnDirection = getDirectionAfterTurn(current, true);
        Direction rightTurnDirection = getDirectionAfterTurn(current, false);

        if (leftTurnDirection == desiredDirection) {
            robot.turnLeft();
        } else if (rightTurnDirection == desiredDirection) {
            robot.turnRight();
        } else {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private Direction getDirectionAfterTurn(Direction current, boolean turnLeft) {
        if (turnLeft) {
            return switch (current) {
                case UP -> Direction.LEFT;
                case LEFT -> Direction.DOWN;
                case DOWN -> Direction.RIGHT;
                case RIGHT -> Direction.UP;
            };
        } else {
            return switch (current) {
                case UP -> Direction.RIGHT;
                case RIGHT -> Direction.DOWN;
                case DOWN -> Direction.LEFT;
                case LEFT -> Direction.UP;
            };
        }
    }
}
