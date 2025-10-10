package core.basesyntax;

/**
 * Moves a Robot from its current position to a target coordinate.
 *
 * <p>Movement strategy:
 * <ol>
 *   <li>Move along X axis.</li>
 *   <li>Move along Y axis.</li>
 * </ol>
 */
public final class RobotRoute {

    /**
     * Move the given robot to the target coordinates (toX, toY).
     *
     * @param robot the robot to move
     * @param toX the target X coordinate
     * @param toY the target Y coordinate
     */
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongX(robot, toX);
        moveAlongY(robot, toY);
    }

    private void moveAlongX(Robot robot, int toX) {
        int currentX = robot.getX();
        if (currentX == toX) {
            return;
        }

        Direction target = currentX < toX ? Direction.RIGHT : Direction.LEFT;
        turnTo(robot, target);

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        int currentY = robot.getY();
        if (currentY == toY) {
            return;
        }

        Direction target = currentY < toY ? Direction.UP : Direction.DOWN;
        turnTo(robot, target);

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    /**
     * Turn the robot to the desired direction using the minimal number of turns.
     *
     * <p>Determines how many left or right turns are required and executes the smaller sequence.
     *
     * @param robot the robot to turn
     * @param target the desired direction
     */
    private void turnTo(Robot robot, Direction target) {
        Direction current = robot.getDirection();
        if (current == target) {
            return;
        }

        int rights = countTurnsRight(current, target);
        int lefts = countTurnsLeft(current, target);

        if (rights <= lefts) {
            for (int i = 0; i < rights; i++) {
                robot.turnRight();
            }
        } else {
            for (int i = 0; i < lefts; i++) {
                robot.turnLeft();
            }
        }
    }

    private int countTurnsRight(Direction from, Direction to) {
        int count = 0;
        Direction d = from;
        while (d != to) {
            d = rightOf(d);
            count++;
        }
        return count;
    }

    private int countTurnsLeft(Direction from, Direction to) {
        int count = 0;
        Direction d = from;
        while (d != to) {
            d = leftOf(d);
            count++;
        }
        return count;
    }

    private Direction rightOf(Direction d) {
        switch (d) {
            case UP:
                return Direction.RIGHT;
            case RIGHT:
                return Direction.DOWN;
            case DOWN:
                return Direction.LEFT;
            case LEFT:
                return Direction.UP;
            default:
                return d;
        }
    }

    private Direction leftOf(Direction d) {
        switch (d) {
            case UP:
                return Direction.LEFT;
            case LEFT:
                return Direction.DOWN;
            case DOWN:
                return Direction.RIGHT;
            case RIGHT:
                return Direction.UP;
            default:
                return d;
        }
    }
}
