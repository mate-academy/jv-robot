package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        moveToX(robot, toX);
        moveToY(robot, toY);
    }

    private void moveToX(Robot robot, int toX) {
        Direction direction = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        turnRobotIntoDirection(robot, direction);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveToY(Robot robot, int toY) {
        Direction direction = toY > robot.getY() ? Direction.UP : Direction.DOWN;
        turnRobotIntoDirection(robot, direction);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobotIntoDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

}
