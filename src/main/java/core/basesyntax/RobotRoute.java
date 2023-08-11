package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        boolean isGreaterX = robot.getX() > toX;
        boolean isGreaterY = robot.getY() > toY;
        Direction toDirection;

        toDirection = isGreaterX ? Direction.LEFT : Direction.RIGHT;

        while (!(toDirection.equals(robot.getDirection()))) {
            robot.turnLeft();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        toDirection = isGreaterY ? Direction.DOWN : Direction.UP;

        while (!(toDirection.equals(robot.getDirection()))) {
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
