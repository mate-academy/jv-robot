package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        newDirection(robot, robot.getX() < toX ? Direction.RIGHT : Direction.LEFT);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        newDirection(robot, robot.getY() < toY ? Direction.UP : Direction.DOWN);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void newDirection(Robot robot, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
    }
}
