package core.basesyntax;

public class RobotRoute {
    private void moveRobotToX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            do {
                robot.stepForward();
            } while (robot.getX() < toX);
        }
        if (robot.getX() > toX) {
            do {
                robot.stepForward();
            } while (robot.getX() > toX);
        }
    }

    private void moveRobotToY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            do {
                robot.stepForward();
            } while (robot.getY() < toY);
        }
        if (robot.getY() > toY) {
            do {
                robot.stepForward();
            } while (robot.getY() > toY);
        }
    }

    private void findWayToX(Robot robot, int toX) {
        if (robot.getX() > toX && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            robot.turnRight();
        }
        if (robot.getX() > toX && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
        }
        if (robot.getX() > toX && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
        }
    }

    private void findWayToY(Robot robot, int toY) {
        if (robot.getY() > toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.findWayToX(robot, toX);
        robotRoute.moveRobotToX(robot, toX);
        robotRoute.findWayToY(robot, toY);
        robotRoute.moveRobotToY(robot, toY);
    }
}
