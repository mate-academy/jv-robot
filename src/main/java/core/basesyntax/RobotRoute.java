package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() != toX) {
            turnRobotToDirection(robot, robot.getX() < toX ? Direction.RIGHT : Direction.LEFT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {
            turnRobotToDirection(robot, robot.getY() < toY ? Direction.UP : Direction.DOWN);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
