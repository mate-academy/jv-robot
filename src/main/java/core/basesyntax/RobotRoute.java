package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        if (x < toX) {
            while (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() == toX) {
                robot.stepForward();
            }
        } else if (x > toX) {
            while (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() == toX) {
                robot.stepForward();
            }
        }

        if (y < toY) {
            while (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() == toY) {
                robot.stepForward();
            }
        } else if (y > toY) {
            while (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() == toY) {
                robot.stepForward();
            }
        }
    }
}
