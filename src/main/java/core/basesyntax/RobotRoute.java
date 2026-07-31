package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int fromX = robot.getX();
        int fromY = robot.getY();
        if (fromX > toX) {
            setDirection(Direction.LEFT, robot);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        } else {
            setDirection(Direction.RIGHT, robot);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        }

        if (fromY > toY) {
            setDirection(Direction.DOWN, robot);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        } else {
            setDirection(Direction.UP, robot);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
    }

    private void setDirection(Direction direction, Robot robot) {
        if (direction == robot.getDirection()) {
            return;
        }
        if (direction == Direction.UP) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
            }
        } else if (direction == Direction.DOWN) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
            }
        } else if (direction == Direction.LEFT) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
            }
        } else if (direction == Direction.RIGHT) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
            }
        }
    }
}
