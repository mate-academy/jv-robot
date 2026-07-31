package core.basesyntax;

/**
 * Provides a method to move a robot from its current position to a target position.
 */
public class RobotRoute {
    /**
     * Moves the robot from its current position to the specified target coordinates.
     *
     * @param robot the robot to move
     * @param toX the target X coordinate
     * @param toY the target Y coordinate
     */
    public void moveRobot(Robot robot, int toX, int toY) {
        moveInXDirection(robot, toX);
        moveInYDirection(robot, toY);
    }

    private void moveInXDirection(Robot robot, int toX) {
        int currentX = robot.getX();
        if (toX > currentX) {
            turnToDirection(robot, Direction.RIGHT);
            stepUntil(robot, toX, true);
        } else if (toX < currentX) {
            turnToDirection(robot, Direction.LEFT);
            stepUntil(robot, toX, true);
        }
    }

    private void moveInYDirection(Robot robot, int toY) {
        int currentY = robot.getY();
        if (toY > currentY) {
            turnToDirection(robot, Direction.UP);
            stepUntil(robot, toY, false);
        } else if (toY < currentY) {
            turnToDirection(robot, Direction.DOWN);
            stepUntil(robot, toY, false);
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    /**
     * Moves the robot forward until it reaches the target coordinate.
     *
     * @param robot the robot to move
     * @param target the target coordinate (X or Y)
     * @param isX true if moving along the X axis, false for Y axis
     */
    private void stepUntil(Robot robot, int target, boolean isX) {
        while ((isX && robot.getX() != target) || (!isX && robot.getY() != target)) {
            robot.stepForward();
        }
    }
}
