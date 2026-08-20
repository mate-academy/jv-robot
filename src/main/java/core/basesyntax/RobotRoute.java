package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() > toX) {
                turnRobotTo(robot, Direction.LEFT);
            } else if (robot.getX() < toX) {
                turnRobotTo(robot, Direction.RIGHT);
            } else if (robot.getY() > toY) {
                turnRobotTo(robot, Direction.DOWN);
            } else if (robot.getY() < toY) {
                turnRobotTo(robot, Direction.UP);
            }

            robot.stepForward();
        }
    }

    private void turnRobotTo(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            if (robot.getDirection() == Direction.UP && direction == Direction.RIGHT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT && direction == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN && direction == Direction.LEFT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
    }
}
