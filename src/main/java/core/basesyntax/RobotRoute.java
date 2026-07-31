package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // handle x first
        while (robot.getDirection() != (toX < robot.getX() ? Direction.LEFT : Direction.RIGHT)) {
            robot.turnRight();
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        // now y
        while (robot.getDirection() != (toY < robot.getY() ? Direction.UP : Direction.DOWN)) {
            robot.turnRight();
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
