package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);
        } else if (robot.getX() < toX) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
        } else if (robot.getY() < toY) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
