package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        Direction firstRightDirection = (robot.getX() > toX) ? Direction.LEFT : Direction.RIGHT;
        this.turnOnPosition(robot, firstRightDirection);
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        Direction secondRightDirection = (robot.getY() > toY) ? Direction.DOWN : Direction.UP;
        this.turnOnPosition(robot, secondRightDirection);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnOnPosition(Robot robot, Direction rightDirection) {
        Direction currentDirection = robot.getDirection();
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

