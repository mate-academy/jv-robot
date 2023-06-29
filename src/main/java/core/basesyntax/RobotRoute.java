package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX = robot.getX() >= toX ? Direction.LEFT : Direction.RIGHT;
        Direction directionY = robot.getY() >= toY ? Direction.DOWN : Direction.UP;
        turn(robot, directionX);
        move(robot, Math.abs(robot.getX() - toX));
        turn(robot, directionY);
        move(robot, Math.abs(robot.getY() - toY));
    }
    
    private void turn(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private void move(Robot robot, int distance) {
        for (int i = 0; i < distance; i++) {
            robot.stepForward();
        }
    }
}
