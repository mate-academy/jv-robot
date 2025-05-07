package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnRobotToX(robot, toX);

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        turnRobotToY(robot, toY);

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobotToX(Robot robot, int toX) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void turnRobotToY(Robot robot, int toY) {
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
    }
}
