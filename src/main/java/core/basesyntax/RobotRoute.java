package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();
        if (startX > toX) {
            while (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                while (startX == toX) {
                    robot.stepForward();
                }
            }
        } else {
            while (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                while (startX == toX) {
                    robot.stepForward();
                }
            }
        }
        if (startY > toY) {
            while (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.UP) {
                while (startY == toY) {
                    robot.stepForward();
                }
            }
        } else {
            while (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                while (startY == toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
