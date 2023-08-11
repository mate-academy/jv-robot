package core.basesyntax;

public class RobotRoute {
    private Direction toDirection;

    public void moveRobot(Robot robot, int toX, int toY) {
        boolean isGreaterX = robot.getX() > toX;
        toDirection = isGreaterX ? Direction.LEFT : Direction.RIGHT;

        while (!(toDirection.equals(robot.getDirection()))) {
            robot.turnLeft();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        boolean isGreaterY = robot.getY() > toY;
        toDirection = isGreaterY ? Direction.DOWN : Direction.UP;

        while (!(toDirection.equals(robot.getDirection()))) {
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
