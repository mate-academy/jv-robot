package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if ((toX - robot.getX()) < 0) {
            if (robot.getDirection() != Direction.LEFT) {
                do {
                    robot.turnLeft();
                } while (robot.getDirection() == Direction.LEFT);
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        } else if ((toX - robot.getX()) > 0) {
            if (robot.getDirection() != Direction.RIGHT) {
                do {
                    robot.turnRight();
                } while (robot.getDirection() == Direction.RIGHT);
            }
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }

        if ((toY - robot.getY()) < 0) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() == Direction.DOWN);
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        } else if ((toY - robot.getY()) > 0) {
            do {
                robot.turnRight();
            } while (robot.getDirection() == Direction.UP);
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }

    }
}
