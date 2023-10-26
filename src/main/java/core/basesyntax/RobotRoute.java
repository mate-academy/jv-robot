package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            if (robot.getX() > toX) {
                changeRobotDirection(robot, Direction.RIGHT);
            } else {
                changeRobotDirection(robot, Direction.LEFT);
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            if (robot.getY() > toY) {
                changeRobotDirection(robot, Direction.DOWN);
            } else {
                changeRobotDirection(robot, Direction.UP);
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void changeRobotDirection(Robot robot, Direction trueDirection) {
        while (robot.getDirection() != trueDirection) {
            robot.turnRight();
        }
    }
}
