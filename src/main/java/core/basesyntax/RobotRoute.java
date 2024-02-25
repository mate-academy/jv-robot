package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX || currentY != toY) {
            Direction horizontalDirection = currentX < toX ? Direction.RIGHT : Direction.LEFT;
            Direction verticalDirection = currentY < toY ? Direction.UP : Direction.DOWN;

            while (currentX != toX && robot.getDirection() != horizontalDirection) {
                robot.turnRight();
            }
            while (currentY != toY && robot.getDirection() != verticalDirection) {
                robot.turnRight();
            }
            robot.stepForward();

            currentX = robot.getX();
            currentY = robot.getY();
        }
    }
}

