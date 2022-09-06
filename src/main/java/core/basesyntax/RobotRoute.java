package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            turnRobotLeft(robot);
        } else {
            turnRobotRight(robot);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            turnRobotDown(robot);
        } else {
            turnRobotUp(robot);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnRobotUp(Robot robot) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
    }

    private void turnRobotRight(Robot robot) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
    }

    private void turnRobotDown(Robot robot) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }
    }

    private void turnRobotLeft(Robot robot) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnRight();
        }
    }
}
