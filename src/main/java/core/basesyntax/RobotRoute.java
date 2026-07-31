package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        Direction direction = robot.getDirection();
        if (toX < 0) {
            while (direction != Direction.LEFT) {
                robot.turnLeft();
                direction = robot.getDirection();
            }
        } else if (toX > 0) {
            while (direction != Direction.RIGHT) {
                robot.turnRight();
                direction = robot.getDirection();
            }
        }
        while (x != toX) {
            robot.stepForward();
            x = robot.getX();
        }
        int y = robot.getY();
        if (toY < 0) {
            while (direction != Direction.DOWN) {
                robot.turnLeft();
                direction = robot.getDirection();
            }
        } else if (toY > 0) {
            while (direction != Direction.UP) {
                robot.turnRight();
                direction = robot.getDirection();
            }
        }
        while (y != toY) {
            robot.stepForward();
            y = robot.getY();
        }
    }
}
