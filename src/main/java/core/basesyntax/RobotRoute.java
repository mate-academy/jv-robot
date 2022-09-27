package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        for (int i = 0; robot.getX() != toX; i++) {
            if (robot.getX() < toX) {
                for (int j = 0; !robot.getDirection().equals(Direction.RIGHT); j++) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
            if (robot.getX() > toX) {
                for (int j = 0; !robot.getDirection().equals(Direction.LEFT); j++) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
        for (int i = 0; robot.getY() != toY; i++) {
            if (robot.getY() < toY) {
                for (int j = 0; !robot.getDirection().equals(Direction.UP); j++) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
            if (robot.getY() > toY) {
                for (int j = 0; !robot.getDirection().equals(Direction.DOWN); j++) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }
}
