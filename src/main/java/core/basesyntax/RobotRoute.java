package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveToXDirection(robot, toX);
        moveToYDirection(robot, toY);
    }

    private void moveToXDirection(Robot robot, int toX) {
        while (robot.getX() != toX) {
            while (robot.getX() > toX) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.stepForward();
                    continue;
                }
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.stepForward();
                continue;
            }
            robot.turnLeft();
        }
    }

    private void moveToYDirection(Robot robot, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.stepForward();
                    continue;
                }
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.UP) {
                robot.stepForward();
                continue;
            }
            robot.turnLeft();
        }
    }
}

