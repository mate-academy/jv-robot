package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }

        if (robot.getX() < toX) {
            if (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() != Direction.DOWN) {
                robot.stepForward();
            }
        }
    }
}
