package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();

        if (robot.getX() < toX) {
            if (direction == Direction.UP) {
                robot.turnRight();
            }
            if (direction == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            if (direction == Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        direction = robot.getDirection();

        if (robot.getX() > toX) {
            if (direction == Direction.UP) {
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (direction == Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        direction = robot.getDirection();

        if (robot.getY() > toY) {
            if (direction == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT) {
                robot.turnRight();
            }
            if (direction == Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        direction = robot.getDirection();

        if (robot.getY() < toY) {
            if (direction == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (direction == Direction.RIGHT) {
                robot.turnLeft();
            }
            if (direction == Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
