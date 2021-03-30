package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;
        while (!robot.getDirection().equals(directionX)) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction directionY = (robot.getY() < toY) ? Direction.UP : Direction.DOWN;
        while (!robot.getDirection().equals(directionY)) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

