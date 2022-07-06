package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }

    }
}
