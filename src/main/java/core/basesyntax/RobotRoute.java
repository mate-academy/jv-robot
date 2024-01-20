package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int stepsToX = toX - robot.getX();
        int stepsToY = toY - robot.getY();
        // Determine direction for robot navigation
        Direction directionToX = (stepsToX > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction directionToY = (stepsToY > 0) ? Direction.UP : Direction.DOWN;
        // Turn robot to appropriate direction and make needed number of steps
        rotateToDirection(robot, directionToX);
        stepToPosition(robot, Math.abs(stepsToX));
        rotateToDirection(robot, directionToY);
        stepToPosition(robot, Math.abs(stepsToY));
    }

    private void rotateToDirection(Robot robot, Direction targetDirection) {
        // Calculate the number of turns needed to reach the target direction
        int directions = Direction.values().length;
        int turns = (directions + targetDirection.ordinal() - robot.getDirection().ordinal())
                    % directions;
        // Choose the shortest rotation direction (left or right)
        if (turns <= 2) {
            for (int i = 0; i < turns; i++) {
                robot.turnLeft();
            }
        } else {
            for (int i = 0; i < directions - turns; i++) {
                robot.turnRight();
            }
        }
    }

    private void stepToPosition(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
