package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {

        Direction directionX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (toX != robot.getX()) {
            while (directionX != robot.getDirection()) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (toY != robot.getY()) {
            while (directionY != robot.getDirection()) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }
}

