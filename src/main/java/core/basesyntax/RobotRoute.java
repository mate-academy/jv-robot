package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        Direction newDirection;
        newDirection = x > toX ? Direction.LEFT
                : x < toX ? Direction.RIGHT
                : y > toY ? Direction.DOWN
                : y < toY ? Direction.UP : robot.getDirection();
        do {
            robot.turnLeft();
        } while (robot.getDirection() != newDirection);
        if (x != toX) {
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        newDirection = y > toY ? Direction.DOWN : Direction.UP;
        do {
            robot.turnRight();
        } while (robot.getDirection() != newDirection);
        if (y != toY) {
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}

