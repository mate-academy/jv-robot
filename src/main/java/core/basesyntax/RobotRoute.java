package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int stepsX = toX - currentX;
        int stepsY = toY - currentY;

        moveInDirection(robot, stepsX, Direction.RIGHT, Direction.LEFT);
        moveInDirection(robot, stepsY, Direction.UP, Direction.DOWN);
    }

    private void moveInDirection(Robot robot, int steps, Direction positive, Direction negative) {
        while (robot.getDirection() != getDirectionForSteps(steps, positive, negative)) {
            robot.turnRight();
        }

        for (int i = 0; i < Math.abs(steps); i++) {
            robot.stepForward();
        }
    }

    private Direction getDirectionForSteps(int steps, Direction positive, Direction negative) {
        return (steps > 0) ? positive : negative;
    }
}
