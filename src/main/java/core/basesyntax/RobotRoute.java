package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        int distanceY = setUpYDistance(robot, toY);
        int distanceYModified = Math.abs(distanceY);
        findYDirection(robot,toY);
        while (distanceYModified > 0) {
            robot.stepForward();
            distanceYModified--;
        }

        int distanceX = setUpXDistance(robot, toX);
        int distanceXModified = Math.abs(distanceX);
        findXDirection(robot,toX);
        while (distanceXModified > 0) {
            robot.stepForward();
            distanceXModified--;
        }

    }

    private void findXDirection(Robot robot, int toX) {
        Direction initialDirection = robot.getDirection();
        if (toX > robot.getX()) {
            switch (initialDirection) {
                case DOWN:
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        } else if (toX < robot.getX()) {
            switch (initialDirection) {
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
                    break;
            }
        }
    }

    private void findYDirection(Robot robot, int toY) {
        Direction initialDirection = robot.getDirection();
        if (toY > robot.getY()) {
            switch (initialDirection) {
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        } else if (toY < robot.getY()) {
            switch (initialDirection) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
    }

    private int setUpYDistance(Robot robot, int toY) {
        return toY - robot.getY();
    }

    private int setUpXDistance(Robot robot, int toX) {
        return toX - robot.getX();
    }

}
