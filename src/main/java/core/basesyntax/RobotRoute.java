package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            orientRobotHorizontally(robot, toX);
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            orientRobotVertically(robot, toY);
            robot.stepForward();
        }
    }

    private void orientRobotHorizontally(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
    }

    private void orientRobotVertically(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
    }
}
