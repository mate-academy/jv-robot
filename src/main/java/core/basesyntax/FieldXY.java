package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction x;
        Direction y;

        if (robot.getX() < toX) {
            x = Direction.RIGHT;
        } else {
            x = Direction.LEFT;
        }

        if (robot.getY() < toY) {
            y = Direction.UP;
        } else {
            y = Direction.DOWN;
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

