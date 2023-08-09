package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotByX(robot, toX);
        moveRobotByY(robot, toY);
    }

    private static void turnRobot (Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private static void moveRobotByX (Robot robot, int toX) {
        if (robot.getX() > toX) {
            turnRobot(robot, Direction.LEFT);
        } else {
            turnRobot(robot, Direction.RIGHT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private static void moveRobotByY (Robot robot, int toY) {
        if (robot.getY() > toY) {
            turnRobot(robot, Direction.DOWN);
        } else {
            turnRobot(robot, Direction.UP);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
