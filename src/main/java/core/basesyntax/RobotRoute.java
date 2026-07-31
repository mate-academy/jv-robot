package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        alignedXPos(robot, toX);
        alignedYPos(robot, toY);
    }

    /**
     * Check and change Robot position on Y coordinate,
     * and change robot direction, from his position and target position
     * @param robot link on robot, what must change position
     * @param toY coordinate point, on Y, to what robot must move
     */
    private void alignedYPos(Robot robot, int toY) {
        if (robot.getY() > toY) {
            moveRobotOnY(robot, toY, Direction.DOWN);
        }
        if (robot.getY() < toY) {
            moveRobotOnY(robot, toY, Direction.UP);
        }
    }

    /**
     * Move robot on x coordinate to targetX position
     * @param robot link on robot, what must move
     * @param toY target position
     * @param direction direction from enum, in what robot must move, for
     *                  move to target
     */
    private void moveRobotOnY(Robot robot, int toY, Direction direction) {
        turnRobotOnDirection(robot, direction);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    /**
     * Check and change Robot position on X coordinate,
     * and change robot direction, from his position and target position
     * @param robot link on robot, what must change position
     * @param toX coordinate point, on X, to what robot must move
     */
    private void alignedXPos(Robot robot, int toX) {
        if (robot.getX() > toX) {
            moveRobotOnX(robot, toX, Direction.LEFT);
        }
        if (robot.getX() < toX) {
            moveRobotOnX(robot, toX, Direction.RIGHT);
        }
    }

    /**
     * Move robot on x coordinate to targetX position
     * @param robot link on robot, what must move
     * @param toX target position
     * @param direction direction from enum, in what robot must move, for
     *                  move to target
     */
    private void moveRobotOnX(Robot robot, int toX, Direction direction) {
        turnRobotOnDirection(robot, direction);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    /**
     * Turn robot left, until hi don`t look on right direction
     * @param robot link on robot, what must change direction
     * @param direction direction from enum
     */
    private void turnRobotOnDirection(Robot robot, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
    }
}
