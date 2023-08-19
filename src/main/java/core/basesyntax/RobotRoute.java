package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX == toX && currentY == toY) {
            return;
        }

        Direction toDirectionX = currentX < toX ? Direction.RIGHT : Direction.LEFT;
        Direction toDirectionY = currentY < toY ? Direction.UP : Direction.DOWN;

        int distanceForX = Math.abs(currentX - toX);
        int distanceForY = Math.abs(currentY - toY);

        moveRobotInDirection(robot, toDirectionX, distanceForX);
        moveRobotInDirection(robot, toDirectionY, distanceForY);
    }

    private void moveRobotInDirection(Robot robot, Direction direction, int steps) {
        turnRobotToDirection(robot, direction);
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        Direction currentDirection = robot.getDirection();
        while (currentDirection != targetDirection) {
            robot.turnRight();
            currentDirection = robot.getDirection();
        }
    }
}
