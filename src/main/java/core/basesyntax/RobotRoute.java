package core.basesyntax;

public class RobotRoute {
    private int startX;
    private int startY;

    public void moveRobot(Robot robot, int toX, int toY) {
        startX = robot.getX();
        startY = robot.getY();

        if (startX == toX && startY == toY) {
            return;
        }
        Direction neededDirection = calculateDirection(toX, toY);

        turnWhileDirectionsNotMatch(robot, neededDirection);
        robot.stepForward();
        moveRobot(robot, toX, toY);
    }

    private void turnWhileDirectionsNotMatch(Robot robot, Direction neededDirection) {
        while (robot.getDirection() != neededDirection) {
            robot.turnLeft();
        }
    }

    private Direction calculateDirection(int toX, int toY) {
        if (toX != startX) {
            return toX - startX < 0 ? Direction.LEFT : Direction.RIGHT;
        }
        return toY - startY < 0 ? Direction.DOWN : Direction.UP;
    }
}
