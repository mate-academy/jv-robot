package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();
        Direction direction = robot.getDirection();

        while (startX != toX || startY != toY) {
            if (direction == Direction.UP && toX > startX) {
                robot.turnRight();
            }
            if (direction == Direction.UP && toX < startX) {
                robot.turnLeft();
            }
            if (direction == Direction.DOWN && toX > startX) {
                robot.turnLeft();
            }
            if (direction == Direction.DOWN && toX < startX) {
                robot.turnRight();
            }
            if (direction == Direction.LEFT && toY > startY) {
                robot.turnRight();
            }
            if (direction == Direction.LEFT && toY < startY) {
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT && toY > startY) {
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT && toY < startY) {
                robot.turnRight();
            }
            robot.stepForward();
            startX = robot.getX();
            startY = robot.getY();
            direction = robot.getDirection();
        }
    }
}
