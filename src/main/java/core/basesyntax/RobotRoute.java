package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction rightDirection;
        if (robot.getX() > toX) {
            rightDirection = Direction.LEFT;
        } else {
            rightDirection = Direction.RIGHT;
        }
        while (!(robot.getDirection().equals(rightDirection))) {
            robot.turnLeft();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            rightDirection = Direction.DOWN;
        } else {
            rightDirection = Direction.UP;
        }
        while (!(robot.getDirection().equals(rightDirection))) {
            robot.turnLeft();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
