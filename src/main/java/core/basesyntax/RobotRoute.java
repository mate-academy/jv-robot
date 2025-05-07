package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            changeDirection(robot, Direction.LEFT);
        } else {
            changeDirection(robot, Direction.RIGHT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            changeDirection(robot, Direction.DOWN);
        } else {
            changeDirection(robot, Direction.UP);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void changeDirection(Robot robot, Direction direction) {
        while (direction != robot.getDirection()) {
            robot.turnRight();
        }
    }
}
