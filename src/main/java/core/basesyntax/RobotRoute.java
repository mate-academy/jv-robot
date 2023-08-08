package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        final int x = robot.getX();
        final int y = robot.getY(); //
        if (x > toX) {
            while (direction != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (x < toX) {
            while (direction != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        while (x != toX) {
            robot.stepForward();
        }
        if (y > toY) {
            while (direction != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        if (y < toY) {
            while (direction != Direction.UP) {
                robot.turnLeft();
            }
        }
        while (y != toY) {
            robot.stepForward();
        }
    }
}
