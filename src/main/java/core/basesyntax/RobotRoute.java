package core.basesyntax;

public class RobotRoute {

    private void findDirectionXWhereToMove(Robot robot, int toX) {
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
            robot.turnRight();
            robot.turnRight();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.UP) {
            robot.turnRight();
        }
        if (robot.getX() < toX && robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
        }

    }

    private void moveRobotX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            do {
                robot.stepForward();
            } while (robot.getX() > toX);
        }
        if ((robot.getX() < toX)) {
            do {
                robot.stepForward();
            } while (robot.getX() < toX);
        }
    }

    private void findDirectionYWhereToMove(Robot robot, int toY) {
        if (robot.getY() > toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            robot.turnLeft();
        }
        if (robot.getY() > toY && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        }
        if (robot.getY() < toY && robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void moveRobotY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            do {
                robot.stepForward();
            } while (robot.getY() > toY);
        }
        if ((robot.getY() < toY)) {
            do {
                robot.stepForward();
            } while (robot.getY() < toY);
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {

        RobotRoute robotRoute = new RobotRoute();
        robotRoute.findDirectionXWhereToMove(robot, toX);
        robotRoute.moveRobotX(robot, toX);
        robotRoute.findDirectionYWhereToMove(robot, toY);
        robotRoute.moveRobotY(robot, toY);
    }

}

