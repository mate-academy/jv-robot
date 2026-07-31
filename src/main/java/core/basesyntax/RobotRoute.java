package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                findRightDirection(robot, Direction.LEFT);
            } else {
                findRightDirection(robot, Direction.RIGHT);
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                findRightDirection(robot, Direction.DOWN);
            } else {
                findRightDirection(robot, Direction.UP);
            }
            robot.stepForward();
        }
    }

    private void findRightDirection(Robot robot, Direction neededDirection) {
        if (robot.getDirection() != neededDirection) {
            if ((neededDirection == Direction.LEFT && robot.getDirection() == Direction.DOWN)
                    || (neededDirection == Direction.UP && robot.getDirection() == Direction.LEFT)
                    || (neededDirection == Direction.RIGHT && robot.getDirection() == Direction.UP)
                    || (neededDirection == Direction.DOWN
                    && robot.getDirection() == Direction.RIGHT)) {
                robot.turnRight();
            } else {
                while (robot.getDirection() != neededDirection) {
                    robot.turnLeft();
                }
            }
        }
    }
}
