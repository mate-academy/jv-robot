package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveHorizontally(robot, toX);
        moveVertically(robot, toY);
    }
    private void moveHorizontally(Robot robot, int toX) {
        if (robot.getX() < toX) {
            turnRobotToDirection(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            turnRobotToDirection(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
    }
    private void moveVertically(Robot robot, int toY) {
        if (robot.getY() < toY) {
            turnRobotToDirection(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
    } private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}