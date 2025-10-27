package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            changeDirection(robot, Direction.RIGHT);
            move(robot, toX - robot.getX());
        } else if (robot.getX() > toX) {
            changeDirection(robot, Direction.LEFT);
            move(robot, robot.getX() - toX);
        }
        if (robot.getY() < toY) {
            changeDirection(robot, Direction.UP);
            move(robot, toY - robot.getY());
        } else if (robot.getY() > toY) {
            changeDirection(robot, Direction.DOWN);
            move(robot, robot.getY() - toY);
        }
    }

    public void changeDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    public void move(Robot robot, int stepCount) {
        for (int i = 0; i < stepCount; i++) {
            robot.stepForward();
        }
    }
}
