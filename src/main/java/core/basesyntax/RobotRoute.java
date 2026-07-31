package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            turnToDirection(robot, Direction.RIGHT);
            moveHorizontally(robot, toX);
        } else if (robot.getX() > toX) {
            turnToDirection(robot, Direction.LEFT);
            moveHorizontally(robot, toX);
        }

        if (robot.getY() < toY) {
            turnToDirection(robot, Direction.UP);
            moveVertically(robot, toY);
        } else if (robot.getY() > toY) {
            turnToDirection(robot, Direction.DOWN);
            moveVertically(robot, toY);
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    private void moveHorizontally(Robot robot, int targetX) {
        while (robot.getX() != targetX) {
            robot.stepForward();
        }
    }

    private void moveVertically(Robot robot, int targetY) {
        while (robot.getY() != targetY) {
            robot.stepForward();
        }
    }
}
