package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                orientRobot(robot, Direction.RIGHT);
            } else {
                orientRobot(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                orientRobot(robot, Direction.UP);
            } else {
                orientRobot(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void orientRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
