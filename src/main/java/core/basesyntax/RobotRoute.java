package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Calculate the difference between the target and current positions
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        // Move along the X-axis
        if (deltaX != 0) {
            // Determine the required direction for X-axis movement
            Direction targetDirectionX = (deltaX > 0) ? Direction.RIGHT : Direction.LEFT;
            // Turn the robot to face the correct direction
            turnRobotToDirection(robot, targetDirectionX);
            // Move the robot step by step along the X-axis
            for (int i = 0; i < Math.abs(deltaX); i++) {
                robot.stepForward();
            }
        }

        // Move along the Y-axis
        if (deltaY != 0) {
            // Determine the required direction for Y-axis movement
            Direction targetDirectionY = (deltaY > 0) ? Direction.UP : Direction.DOWN;
            // Turn the robot to face the correct direction
            turnRobotToDirection(robot, targetDirectionY);
            // Move the robot step by step along the Y-axis
            for (int i = 0; i < Math.abs(deltaY); i++) {
                robot.stepForward();
            }
        }
    }

    // Helper method to turn the robot to a specific direction
    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight(); // or robot.turnLeft(), depending on the shortest turn
        }
    }
}
