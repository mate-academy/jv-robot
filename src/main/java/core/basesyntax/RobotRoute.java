package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        // Determine the direction to move horizontally
        Direction horizontalDirection = (toX > currentX) ? Direction.RIGHT : Direction.LEFT;
        // Determine the direction to move vertically
        Direction verticalDirection = (toY > currentY) ? Direction.UP : Direction.DOWN;

        // Move horizontally until reaching the target X-coordinate
        while (currentX != toX) {
            if (robot.getDirection() != horizontalDirection) {
                robot.setDirection(horizontalDirection);
            }
            robot.stepForward();
            currentX += (horizontalDirection == Direction.RIGHT) ? 1 : -1;
        }

        // Move vertically until reaching the target Y-coordinate
        while (currentY != toY) {
            if (robot.getDirection() != verticalDirection) {
                robot.setDirection(verticalDirection);
            }
            robot.stepForward();
            currentY += (verticalDirection == Direction.UP) ? 1 : -1;
        }
    }
}
