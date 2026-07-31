package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() != toX) {
            Direction targetX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
            turnTo(robot, targetX);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            Direction targetY = toY > robot.getY() ? Direction.UP : Direction.DOWN;
            turnTo(robot, targetY);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void turnTo(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}
