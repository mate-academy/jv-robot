package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        Direction direction;
        int walk;

        direction = toX - robot.getX() > 0 ? Direction.RIGHT : Direction.LEFT;
        walk = Math.abs(toX - robot.getX());
        turnAndMove(robot, direction, walk);

        direction = toY - robot.getY() > 0 ? Direction.UP : Direction.DOWN;
        walk = Math.abs(toY - robot.getY());
        turnAndMove(robot, direction, walk);
    }

    private void turnAndMove(Robot robot, Direction direction, int walk) {
        turn(robot, direction);
        run(robot, walk);
    }

    private void run(Robot robot, int steps) {
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
