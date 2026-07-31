package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        int stepX = Math.abs(currentX - toX);
        int stepY = Math.abs(currentY - toY);

        var xdirection = toX - currentX > 0 ? Direction.RIGHT : Direction.LEFT;
        var ydirection = toY - currentY > 0 ? Direction.UP : Direction.DOWN;

        move(robot, stepX, xdirection);
        move(robot, stepY, ydirection);

    }

    private void move(Robot robot, int steps, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }

        while (steps > 0) {
            robot.stepForward();
            steps--;
        }
    }
}
