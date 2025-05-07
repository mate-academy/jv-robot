package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction direction = robot.getDirection();
        if (toX < robot.getX()) {
            while (direction != Direction.LEFT) {
                robot.turnLeft();
                direction = robot.getDirection();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            while (direction != Direction.RIGHT) {
                robot.turnRight();
                direction = robot.getDirection();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {
            while (direction != Direction.DOWN) {
                robot.turnLeft();
                direction = robot.getDirection();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY > robot.getY()) {
            while (direction != Direction.UP) {
                robot.turnRight();
                direction = robot.getDirection();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
