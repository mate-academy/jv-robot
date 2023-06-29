package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() > toX) {
            changeDirection(robot, Direction.LEFT);
            robot.stepForward();
            moveRobot(robot, toX, toY);
        } else if (robot.getX() < toX) {
            changeDirection(robot, Direction.RIGHT);
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }

        if (robot.getY() > toY) {
            changeDirection(robot, Direction.DOWN);
            robot.stepForward();
            moveRobot(robot, toX, toY);
        } else if (robot.getY() < toY) {
            changeDirection(robot, Direction.UP);
            robot.stepForward();
            moveRobot(robot, toX, toY);
        }
    }

    private void changeDirection(Robot robot, Direction direction) {
        if (!robot.getDirection().equals(direction)) {
            robot.turnRight();
            changeDirection(robot, direction);
        }
    }
}
