package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            if (robot.getDirection() != Direction.LEFT) {
                do {
                    robot.turnLeft();
                } while (robot.getDirection() != Direction.LEFT);
            }
            do {
                robot.stepForward();
            } while (toX != robot.getX());
        }
        if (toX > robot.getX()) {
            if (robot.getDirection() != Direction.RIGHT) {
                do {
                    robot.turnRight();
                } while (robot.getDirection() != Direction.RIGHT);
            }
            do {
                robot.stepForward();
            } while (toX != robot.getX());
        }
        if (toX == robot.getX() && toY == robot.getY()) {
            return;
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() != Direction.UP) {
                do {
                    robot.turnLeft();
                } while (robot.getDirection() != Direction.UP);
            }
            do {
                robot.stepForward();
            } while (toY != robot.getY());
        }
        if (robot.getY() > toY) {
            if (robot.getDirection() != Direction.DOWN) {
                do {
                    robot.turnLeft();
                } while (robot.getDirection() != Direction.DOWN);
                do {
                    robot.stepForward();
                } while (toY != robot.getY());
            }
        }
    }
}
