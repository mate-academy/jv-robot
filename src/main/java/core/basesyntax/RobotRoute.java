package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                changeCurrentPosition(robot, Direction.RIGHT);
            } else {
                changeCurrentPosition(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                changeCurrentPosition(robot, Direction.UP);
            } else {
                changeCurrentPosition(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void changeCurrentPosition(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}
