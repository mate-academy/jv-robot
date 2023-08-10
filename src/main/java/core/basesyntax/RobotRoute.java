package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAxisX(robot, toX);
        moveAxisY(robot, toY);
    }

    public void turnAxisX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        } else if (toX < robot.getX()) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }
        }
    }

    public void turnAxisY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
        } else if (toY < robot.getY()) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
        }
    }

    public void moveAxisX(Robot robot, int toX) {
        turnAxisX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void moveAxisY(Robot robot, int toY) {
        turnAxisY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
