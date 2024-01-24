package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        // Determine how far a robot from its destination
        int deltaX = toX - currentX;
        int deltaY = toY - currentY;

        // Determine required directions
        Direction horizontalDirection = deltaX > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction verticalDirection = deltaY > 0 ? Direction.UP : Direction.DOWN;

        // Rotate a robot till it faces the right X direction
        while (currentDirection != horizontalDirection) {
            robot.turnRight();
            currentDirection = robot.getDirection(); // Update currentDirection
        }

        // Step forward till it reaches the right X coordinates
        while (currentX != toX) {
            robot.stepForward();
            currentX = robot.getX(); // Update currentX
        }

        // Rotate a robot till it faces the right Y direction
        while (currentDirection != verticalDirection) {
            robot.turnLeft();
            currentDirection = robot.getDirection(); // Update currentDirection
        }

        // Step forward till it reaches the right Y coordinates
        while (currentY != toY) {
            robot.stepForward();
            currentY = robot.getY(); // Update currentY
        }
    }
}