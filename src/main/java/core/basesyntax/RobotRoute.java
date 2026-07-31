package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction;
        if (robot.getX() > toX) {
            direction = Direction.LEFT;
        } else {
            direction = Direction.RIGHT;
        }
        while (direction != robot.getDirection()) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            direction = Direction.DOWN;
        } else {
            direction = Direction.UP;
        }
        while (direction != robot.getDirection()) {
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
