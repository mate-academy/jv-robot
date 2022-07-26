package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
        } else if (robot.getY() > toY) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        if (robot.getX() < toX) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.RIGHT);
        } else if (robot.getX() > toX) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
