package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction rightDirection;
        if (toX > robot.getX()) {
            rightDirection = Direction.RIGHT;
        } else {
            rightDirection = Direction.LEFT;
        }
        while (robot.getDirection() != rightDirection) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (toY > robot.getY()) {
            rightDirection = Direction.UP;
        } else {
            rightDirection = Direction.DOWN;
        }
        while (robot.getDirection() != rightDirection) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
