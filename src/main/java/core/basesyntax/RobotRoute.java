package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveTo(robot, toX, robot.getX(), Direction.LEFT, Direction.RIGHT);
        moveTo(robot, toY, robot.getY(), Direction.DOWN, Direction.UP);
    }

    private void moveTo(Robot robot, int target, int current,
                        Direction leftDirection, Direction rightDirection) {
        while (current != target) {
            if (current < target) {
                if (robot.getDirection() != rightDirection) {
                    robot.turnRight();
                } else {
                    robot.stepForward();
                    current++;
                }
            } else {
                if (robot.getDirection() != leftDirection) {
                    robot.turnLeft();
                } else {
                    robot.stepForward();
                    current--;
                }
            }
        }
    }
}
