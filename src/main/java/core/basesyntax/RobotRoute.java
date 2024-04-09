package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        moveX(robot, robot.getX(), toX);
        moveY(robot, robot.getY(), toY);
    }

    private void moveX(Robot robot, int position, int toX) {
        while (position < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
            position = robot.getX();
        }
        while (position > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
            position = robot.getX();
        }
    }

    private void moveY(Robot robot, int position, int toY) {
        while (position < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
            position = robot.getY();
        }
        while (position > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            robot.stepForward();
            position = robot.getY();
        }
    }
}
