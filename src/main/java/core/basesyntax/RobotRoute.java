package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveX(robot, toX);
        moveY(robot, toY);
    }

    private void moveX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            setDirection(robot, Direction.RIGHT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else {
            setDirection(robot, Direction.LEFT);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
    }

    private void moveY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            setDirection(robot, Direction.DOWN);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else {
            setDirection(robot, Direction.UP);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void setDirection(Robot robot, Direction direction) {
        if (robot.getDirection() == Direction.UP && direction == Direction.LEFT) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.DOWN && direction == Direction.RIGHT) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.RIGHT && direction == Direction.UP) {
            robot.turnLeft();
        } else if (robot.getDirection() == Direction.LEFT && direction == Direction.DOWN) {
            robot.turnLeft();
        } else {
            while (robot.getDirection() != direction) {
                robot.turnRight();
            }
        }
    }
}
