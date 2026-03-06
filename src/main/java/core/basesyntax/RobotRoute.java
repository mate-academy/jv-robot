package core.basesyntax;

public class RobotRoute {
    private void faceDirection(Robot robot, Direction needed) {
        while (robot.getDirection() != needed) {
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            faceDirection(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            faceDirection(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            faceDirection(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            faceDirection(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}
