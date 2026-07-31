package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        changeDirection(robot, findDirection(robot.getX(), toX, 0));
        goToCoordinate(robot, toX, 0);
        changeDirection(robot, findDirection(robot.getY(), toY, 1));
        goToCoordinate(robot, toY, 1);
    }

    public void changeDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    public Direction findDirection(int x, int toX, int axis) {
        if (axis == 0) {
            return x > toX ? Direction.LEFT : Direction.RIGHT;
        }
        return x > toX ? Direction.DOWN : Direction.UP;
    }

    public void goToCoordinate(Robot robot, int target, int axis) {
        if (axis == 0) {
            while (robot.getX() != target) {
                robot.stepForward();
            }
            return;
        }
        while (robot.getY() != target) {
            robot.stepForward();
        }
    }
}
