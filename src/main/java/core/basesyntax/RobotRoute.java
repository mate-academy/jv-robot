package core.basesyntax;

public class RobotRoute {
    private void faceDiraction(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                faceDiraction(robot, Direction.RIGHT);
            } else {
                faceDiraction(robot, Direction.LEFT);
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                faceDiraction(robot, Direction.UP);
            } else {
                faceDiraction(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }
}
