package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int horizontal;
        int vertical;
        horizontal = robot.getX();
        vertical = robot.getY();
        if (direction == Direction.UP) {
            robot.turnRight();
        }
        if (direction == Direction.DOWN) {
            robot.turnLeft();
        }
        if (direction == Direction.LEFT) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (toX > horizontal && toY < vertical) {
            for (int i = 0; i < toX - horizontal; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int i = 0; i < vertical - toY; i++) {
                robot.stepForward();
            }
        }
        if (toX > horizontal && toY > vertical) {
            for (int i = 0; i < toX - horizontal; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = 0; i < toY - vertical; i++) {
                robot.stepForward();
            }
        }
        if (toX < horizontal && toY < vertical) {
            robot.turnLeft();
            robot.turnLeft();
            for (int i = 0; i < horizontal - toX; i++) {
                robot.stepForward();
            }
            robot.turnLeft();
            for (int i = 0; i < vertical - toY; i++) {
                robot.stepForward();
            }
        }
        if (toX < horizontal && toY > vertical) {
            robot.turnLeft();
            robot.turnLeft();
            for (int i = 0; i < horizontal - toX; i++) {
                robot.stepForward();
            }
            robot.turnRight();
            for (int i = 0; i < toY - vertical; i++) {
                robot.stepForward();
            }
        }
        if (toX == horizontal && toY > vertical) {

            robot.turnLeft();
            for (int i = 0; i < toY - vertical; i++) {
                robot.stepForward();
            }
        }
    }
}
