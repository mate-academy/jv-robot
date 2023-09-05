package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        this.turnOnPosition(robot, robot.getX(), toX, Direction.LEFT, Direction.RIGHT);
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        this.turnOnPosition(robot, robot.getY(), toY, Direction.DOWN, Direction.UP);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnOnPosition(Robot robot, int get, int to, Direction directionFirst, Direction directionSecond) {
        Direction currentDirection = robot.getDirection();
        Direction rightDirection = (get > to) ? directionFirst : directionSecond;
        if (currentDirection == Direction.RIGHT && rightDirection == Direction.DOWN
                || currentDirection == Direction.DOWN && rightDirection == Direction.LEFT
                || currentDirection == Direction.LEFT && rightDirection == Direction.UP
                || currentDirection == Direction.UP && rightDirection == Direction.RIGHT) {
            while (robot.getDirection() != rightDirection) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != rightDirection) {
                robot.turnLeft();
            }
        }
    }
}

