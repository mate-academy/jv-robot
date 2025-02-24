package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }

        while (robot.getX() == toX) {
            robot.stepForward();
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
