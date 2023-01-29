package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() <= toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
        if (toX < robot.getX()) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() <= toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
