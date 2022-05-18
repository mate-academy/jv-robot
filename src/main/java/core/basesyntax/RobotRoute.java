package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (!Direction.LEFT.equals(robot.getDirection())) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            while (!Direction.RIGHT.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (!Direction.DOWN.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            while (!Direction.UP.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }
}
