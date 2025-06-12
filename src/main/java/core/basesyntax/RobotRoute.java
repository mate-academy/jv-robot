package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int actualX = robot.getX();
        int actualY = robot.getY();

        if (toX > actualX) {
            turnToDirection(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (toX < actualX) {
            turnToDirection(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (toY > actualY) {
            turnToDirection(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (toY < actualY) {
            turnToDirection(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    public void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
