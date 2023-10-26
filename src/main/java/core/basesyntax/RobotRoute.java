package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (!(toX == robot.getX() && toY == robot.getY())) {
            moveToX(robot, toX);
            moveToY(robot, toY);
        }
    }

    public void moveToX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);
        } else if (toX < robot.getX()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);
        }
        do {
            robot.stepForward();
        } while (robot.getX() != toX);
    }

    public void moveToY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
        } else if (toY < robot.getY()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
        }
        do {
            robot.stepForward();
        } while (robot.getY() != toY);
    }
}
