package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveToCoordinate(robot, toX - robot.getX(), Direction.RIGHT, Direction.LEFT);
        moveToCoordinate(robot, toY - robot.getY(), Direction.UP, Direction.DOWN);
    }

    private void moveToCoordinate(Robot robot, int delta, Direction positive, Direction negative) {
        if (delta == 0) {
            return;
        }

        Direction target = delta > 0 ? positive : negative;

        while (robot.getDirection() != target) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(delta); i++) {
            robot.stepForward();
        }
    }
}
