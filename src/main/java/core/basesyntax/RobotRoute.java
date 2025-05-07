package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction dirX = robot.getX() >= toX ? Direction.LEFT : Direction.RIGHT;
        Direction dirY = robot.getY() >= toY ? Direction.DOWN : Direction.UP;
        turn(robot, dirX);
        move(robot, Math.abs(robot.getX() - toX));
        turn(robot, dirY);
        move(robot, Math.abs(robot.getY() - toY));
    }

    private void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    private void move(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }

}
