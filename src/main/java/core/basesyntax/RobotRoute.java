package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            if (robot.getDirection() != Direction.RIGHT) {
                do {
                    robot.turnRight();
                } while (robot.getDirection() != Direction.RIGHT);
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (robot.getX() > toX) {
            if (robot.getDirection() != Direction.LEFT) {
                do {
                    robot.turnRight();
                } while (robot.getDirection() != Direction.LEFT);
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                do {
                    robot.turnRight();
                } while (robot.getDirection() != Direction.UP);
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
        if (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                do {
                    robot.turnRight();
                } while (robot.getDirection() != Direction.DOWN);
            }
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}
