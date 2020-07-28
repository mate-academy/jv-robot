package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX;
        Direction directionY;

        if (robot.getX() < toX) {
            directionX = Direction.RIGHT;
        } else {
            directionX = Direction.LEFT;
        }

        if (robot.getY() < toY) {
            directionY = Direction.UP;
        } else {
            directionY = Direction.DOWN;
        }

        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != directionY) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

