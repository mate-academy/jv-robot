package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        setDirection(robot, toX > robot.getX() ? Direction.RIGHT : Direction.LEFT);
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        setDirection(robot, toY > robot.getY() ? Direction.UP : Direction.DOWN);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void setDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}

