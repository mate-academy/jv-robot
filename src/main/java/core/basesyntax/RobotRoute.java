package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int x = robot.getX();
        final int y = robot.getY();
        Direction direction = robot.getDirection();
        if (x < toX) {
            for (int i = 1; i < 4; i++) {
                if (direction != Direction.RIGHT) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
            }
        }
        for (int i = 1; i <= toX - x; i++) {
            robot.stepForward();
        }
        if (x > toX) {
            for (int i = 1; i < 4; i++) {
                if (direction != Direction.LEFT) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
            }
            for (int i = 1; i <= x - toX; i++) {
                robot.stepForward();
            }
        }
        if (y < toY) {
            for (int i = 1; i < 4; i++) {
                if (direction != Direction.UP) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
            }
            for (int i = 1; i <= toY - y; i++) {
                robot.stepForward();
            }
        }
        if (y > toY) {
            for (int i = 1; i < 4; i++) {
                if (direction != Direction.DOWN) {
                    robot.turnRight();
                    direction = robot.getDirection();
                }
            }
            for (int i = 1; i <= y - toY; i++) {
                robot.stepForward();
            }
        }
    }
}
