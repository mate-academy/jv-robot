package core.basesyntax;

public class RobotRoute {

    private void turnToDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot == null) {
            return;
        }
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                turnToDirection(robot, Direction.RIGHT);
            } else {
                turnToDirection(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                turnToDirection(robot, Direction.UP);
            } else {
                turnToDirection(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }
}
