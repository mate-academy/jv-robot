package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int robotX = robot.getX();
        int robotY = robot.getY();
        Direction robotDirection = robot.getDirection();

        if (robotX > toX) {
            rotateRobot(robot, Direction.LEFT);
            do {
                robot.stepForward();
                robotX = robot.getX();
            } while (robotX != toX);
        } else if (robotX < toX) {
            rotateRobot(robot, Direction.RIGHT);
            do {
                robot.stepForward();
                robotX = robot.getX();
            } while (robotX != toX);
        }

        if (robotY > toY) {
            rotateRobot(robot, Direction.DOWN);
            do {
                robot.stepForward();
                robotY = robot.getY();
            } while (robotY != toY);
        } else if (robotY < toY) {
            rotateRobot(robot, Direction.UP);
            do {
                robot.stepForward();
                robotY = robot.getY();
            } while (robotY != toY);
        }
    }

    private void rotateRobot(Robot robot, Direction directionNeeded) {
        Direction robotDirection = robot.getDirection();

        if (robotDirection != directionNeeded) {
            if ((robotDirection == Direction.UP & directionNeeded == Direction.RIGHT)
                    || (robotDirection == Direction.RIGHT & directionNeeded == Direction.DOWN)
                    || (robotDirection == Direction.DOWN & directionNeeded == Direction.LEFT)
                    || (robotDirection == Direction.LEFT & directionNeeded == Direction.UP)) {
                robot.turnRight();
            } else {
                do {
                    robot.turnLeft();
                    robotDirection = robot.getDirection();
                } while (robotDirection != directionNeeded);
            }
        }
    }
}
