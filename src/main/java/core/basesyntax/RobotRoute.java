package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
