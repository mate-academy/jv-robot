package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction expDirToX = (toX <= robot.getX()) ? Direction.LEFT : Direction.RIGHT;
        Direction expDirToY = (toY <= robot.getY()) ? Direction.DOWN : Direction.UP;

        while (expDirToX != robot.getDirection()) {
            robot.turnLeft();
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        while (expDirToY != robot.getDirection()) {
            robot.turnRight();
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
