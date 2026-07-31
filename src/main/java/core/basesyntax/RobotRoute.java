package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotHorizontal(robot, toX);
        moveRobotVertical(robot, toY);
    }

    private void moveRobotHorizontal(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveRobotVertical(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
