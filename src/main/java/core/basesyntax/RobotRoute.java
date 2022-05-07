package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction routeToX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;

        while (routeToX != robot.getDirection()) {
            robot.turnLeft();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        Direction routeToY = robot.getY() > toY ? Direction.DOWN : Direction.UP;

        while (routeToY != robot.getDirection()) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
