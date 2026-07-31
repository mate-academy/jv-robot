package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                while (!robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
            if (robot.getX() > toX) {
                while (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                while (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                while (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }
}
