package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        this.turnOn(robot, robot.getX(), toX, Direction.LEFT, Direction.RIGHT);
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        this.turnOn(robot, robot.getY(), toY, Direction.DOWN, Direction.UP);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnOn(Robot robot, int get, int to, Direction dir1, Direction dir2) {
        Direction currentDirection = robot.getDirection();
        Direction rightDirection = (get > to) ? dir1 : dir2;
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

