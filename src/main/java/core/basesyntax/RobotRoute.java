package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveOnX(robot, toX);
        moveOnY(robot, toY);
    }

    private static void moveOnY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }

        } else if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void moveOnX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
