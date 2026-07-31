package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int stepsX = toX - robot.getX();
        switchDirection(robot, (stepsX > 0) ? Direction.RIGHT : Direction.LEFT);
        singleAxisMovement(robot, stepsX);

        int stepsY = toY - robot.getY();
        switchDirection(robot, (stepsY > 0) ? Direction.UP : Direction.DOWN);
        singleAxisMovement(robot, stepsY);
    }

    private void switchDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private void singleAxisMovement(Robot robot, int steps) {
        for (int i = 0; i < Math.abs(steps); i++) {
            robot.stepForward();
        }
    }
}
