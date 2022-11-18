package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction;
        int steps;

        direction = toX - robot.getX() > 0 ? Direction.RIGHT : Direction.LEFT;
        steps = Math.abs(toX - robot.getX());
        turnAndMove(robot, direction, steps);

        direction = toY - robot.getY() > 0 ? Direction.UP : Direction.DOWN;
        steps = Math.abs(toY - robot.getY());
        turnAndMove(robot, direction, steps);
    }

    private void turnAndMove(Robot robot, Direction direction, int steps) {
        turn(robot, direction);
        move(robot, steps);
    }

    private void move(Robot robot, int steps) {
        while (steps > 0) {
            robot.stepForward();
            steps--;
        }
    }

    private void turn(Robot robot, Direction direction) {
        while (direction != robot.getDirection()) {
            robot.turnLeft();
        }
    }
}
