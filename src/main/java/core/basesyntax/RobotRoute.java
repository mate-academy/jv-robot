package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (robot.getY() < toY) {
            do {
                robot.turnRight();
            } while (robot.getDirection().equals(Direction.UP));
            for (int i = robot.getY(); i < toY ; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            do {
                robot.turnRight();
            } while (robot.getDirection().equals(Direction.DOWN));
            for (int i = robot.getY(); i > toY ; i--) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            do {
                robot.turnRight();
            } while (robot.getDirection().equals(Direction.RIGHT));
            for (int i = robot.getX(); i < toX ; i++) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX) {
            do {
                robot.turnRight();
            } while (robot.getDirection().equals(Direction.LEFT));
            for (int i = robot.getX(); i > toX ; i--) {
                robot.stepForward();
            }
        }
    }
}
