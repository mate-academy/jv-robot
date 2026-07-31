package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            while (robot.getDirection() != findXDirection(robot.getX(), toX)) {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            while (robot.getDirection() != findYDirection(robot.getY(), toY)) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }

    private Direction findXDirection(int currentPositionX, int finalPositionX) {
        return currentPositionX > finalPositionX ? Direction.LEFT : Direction.RIGHT;
    }

    private Direction findYDirection(int currentPositionY, int finalPositionY) {
        return currentPositionY > finalPositionY ? Direction.DOWN : Direction.UP;
    }
}

