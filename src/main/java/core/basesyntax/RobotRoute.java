package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        int y = robot.getY();
        
        if (x > toX) {
            while (direction != Direction.LEFT) {
                robot.turnLeft();
                direction = robot.getDirection();
            }
            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        }
        if (x < toX) {
            while (direction != Direction.RIGHT) {
                robot.turnRight();
                direction = robot.getDirection();
            }
            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        }
        if (robot.getY() > toY) {
            while (direction != Direction.DOWN) {
                robot.turnLeft();
                direction = robot.getDirection();
            }
            while (y != toY) {
                robot.stepForward();
                y = robot.getY();
            }
        }
        if (robot.getY() < toY) {
            while (direction != Direction.UP) {
                robot.turnRight();
                direction = robot.getDirection();
            }
            while (y != toY) {
                robot.stepForward();
                y = robot.getY();
            }
        }
    }
}
