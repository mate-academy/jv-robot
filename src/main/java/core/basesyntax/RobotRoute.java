package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX < x) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < y) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
