package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnX(robot, toX);
        moveX(robot, toX);
        turnY(robot, toY);
        moveY(robot, toY);
    }

    private void turnX(Robot robot, int toX) {
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

    private void turnY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
    }

    private void moveX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
