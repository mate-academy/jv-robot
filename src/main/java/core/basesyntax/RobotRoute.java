package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            moveRobotRight(robot, toX);
        } else if (robot.getX() > toX) {
            moveRobotLeft(robot, toX);
        }

        if (robot.getY() < toY) {
            moveRobotUp(robot, toY);
        } else if (robot.getY() > toY) {
            moveRobotDown(robot, toY);
        }
    }

    private void moveRobotDown(Robot robot, int toY) {
        while (robot.getDirection() != Direction.valueOf("DOWN")) {
            robot.turnLeft();
        }
        while (robot.getY() > toY) {
            robot.stepForward();
        }
    }

    private void moveRobotUp(Robot robot, int toY) {
        while (robot.getDirection() != Direction.valueOf("UP")) {
            robot.turnRight();
        }
        while (robot.getY() < toY) {
            robot.stepForward();
        }
    }

    private void moveRobotLeft(Robot robot, int toX) {
        while (robot.getDirection() != Direction.valueOf("LEFT")) {
            robot.turnLeft();
        }
        while (robot.getX() > toX) {
            robot.stepForward();
        }
    }

    private void moveRobotRight(Robot robot, int toX) {
        while (robot.getDirection() != Direction.valueOf("RIGHT")) {
            robot.turnRight();
        }
        while (robot.getX() < toX) {
            robot.stepForward();
        }
    }
}
