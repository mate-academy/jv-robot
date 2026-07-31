package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction axisDirection = (toX < robot.getX()) ? Direction.LEFT : Direction.RIGHT;

        while (axisDirection != robot.getDirection()) {
            robot.turnLeft();
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        axisDirection = (toY < robot.getY()) ? Direction.DOWN : Direction.UP;

        while (axisDirection != robot.getDirection()) {
            robot.turnLeft();
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
