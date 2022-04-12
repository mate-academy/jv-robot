package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if ((robot.getX() - toX) >= 0) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            while ((robot.getX() - toX) > 0) {
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            while ((toX - robot.getX()) > 0) {
                robot.stepForward();
            }
        }

        if ((robot.getY() - toY) >= 0) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            while ((robot.getY() - toY) > 0) {
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            while ((toY - robot.getY()) > 0) {
                robot.stepForward();
            }
        }
    }
}
