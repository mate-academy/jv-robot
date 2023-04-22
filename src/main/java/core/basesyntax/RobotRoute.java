package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        RobotRoute.routeForx(robot, toX);
        RobotRoute.routeFory(robot, toY);
    }

    private static void routeForx(Robot robot, int toX) {
        int x = robot.getX();
        if (x > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (x < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (x != toX) {
            robot.stepForward();
        }
    }

    private static void routeFory(Robot robot, int toY) {
        int y = robot.getY();
        if (y < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = 0; i < (toY - y); i++) {
                robot.stepForward();
            }
        } else if (y > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while (y != toY) {
            robot.stepForward();
        }
    }
}
