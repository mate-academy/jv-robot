package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnRobotToX(robot, toX);
        turnRobotToY(robot, toY);
    }

    private void turnRobotToX(Robot robot, int to) {
        while (robot.getX() > to) {
            if (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }

        while (robot.getX() < to) {
            if (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
    }

    private void turnRobotToY(Robot robot, int to) {
        while (robot.getY() < to) {
            if (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }

        while (robot.getY() > to) {
            if (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }

    }
}
