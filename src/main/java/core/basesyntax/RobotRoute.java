package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongY(robot, toY);
        moveAlongX(robot, toX);
    }

    private void orientTo(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        while (robot.getY() < toY) {
            orientTo(robot, Direction.UP);
            robot.stepForward();
        }
        while (robot.getY() > toY) {
            orientTo(robot, Direction.DOWN);
            robot.stepForward();
        }
    }

    private void moveAlongX(Robot robot, int toX) {
        while (robot.getX() < toX) {
            orientTo(robot, Direction.RIGHT);
            robot.stepForward();
        }
        while (robot.getX() > toX) {
            orientTo(robot, Direction.LEFT);
            robot.stepForward();
        }

    }
}
