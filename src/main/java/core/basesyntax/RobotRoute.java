package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction x;
        Direction y;
        if (robot.getX() > toX) {
            x = Direction.LEFT;
        } else {
            x = Direction.RIGHT;
        }

        if (robot.getY() > toY) {
            y = Direction.DOWN;
        } else {
            y = Direction.UP;
        }

        while (robot.getDirection() != x) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != y) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
