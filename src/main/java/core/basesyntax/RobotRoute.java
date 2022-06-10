package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int y = robot.getY();
        int x = robot.getX();
        if ((toX < x) && (toY < y)) {
            moveRobotFirstQuandrant(robot, toX, toY);
        } else if ((toX > x) && (toY < y)) {
            moveRobotSecondQuandrant(robot, toX, toY);
        } else if ((toX > x) && (toY > y)) {
            moveRobotThirdQuandrant(robot, toX, toY);
        } else {
            moveRobotFourQuandrant(robot, toX, toY);
        }
    }


    private void moveRobotFirstQuandrant(Robot robot, int x, int y) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (robot.getX() != x) {
            robot.stepForward();
        }
        robot.turnLeft();
        while (robot.getY() != y) {
            robot.stepForward();
        }
    }

    private void moveRobotSecondQuandrant(Robot robot, int x, int y) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }

        while (robot.getX() != x) {
            robot.stepForward();
        }
        robot.turnRight();
        while (robot.getY() != y) {
            robot.stepForward();
        }
    }

    private void moveRobotThirdQuandrant(Robot robot, int x, int y) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
        while (robot.getX() != x) {
            robot.stepForward();
        }
        robot.turnLeft();
        while (robot.getY() != y) {
            robot.stepForward();
        }
    }

    private void moveRobotFourQuandrant(Robot robot, int x, int y) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        while (robot.getX() != x) {
            robot.stepForward();
        }
        robot.turnRight();
        while (robot.getY() != y) {
            robot.stepForward();
        }
    }
}
