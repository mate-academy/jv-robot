package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX
                    || robot.getY() != toY) {
            if (robot.getX() < toX) {
                rotateRobot(robot, Direction.RIGHT);
                robot.stepForward();
            } else if (robot.getX() > toX) {
                rotateRobot(robot, Direction.LEFT);
                robot.stepForward();
            } else if (robot.getY() < toY) {
                rotateRobot(robot, Direction.UP);
                robot.stepForward();
            } else {
                rotateRobot(robot, Direction.DOWN);
                robot.stepForward();
            }
        }
    }

    private void rotateRobot(Robot robot, Direction toDirection) {
        while (robot.getDirection() != toDirection) {
            robot.turnLeft();
        }
    }
}
