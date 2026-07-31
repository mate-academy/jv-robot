package core.basesyntax;

public class RobotRoute {
    private void turnRobotToDesiredDirection(Robot robot, Direction desiredDirection) {
        while (robot.getDirection() != desiredDirection) {
            robot.turnLeft();
        }
    }

    private void stepForwardBasedOnDifference(Robot robot, int diff) {
        for (int i = 0; i < Math.abs(diff); i++) {
            robot.stepForward();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            int xdiff = toX - robot.getX();
            Direction desiredDirection = xdiff > 0 ? Direction.RIGHT : Direction.LEFT;

            turnRobotToDesiredDirection(robot, desiredDirection);
            stepForwardBasedOnDifference(robot, xdiff);
        }

        if (robot.getY() != toY) {
            int ydiff = toY - robot.getY();
            Direction desiredDirection = ydiff > 0 ? Direction.UP : Direction.DOWN;

            turnRobotToDesiredDirection(robot, desiredDirection);
            stepForwardBasedOnDifference(robot, ydiff);
        }
    }
}
