package core.basesyntax;

public class RobotRoute {
    private void setRobotDirection(Robot robot, String setDirection) {
        while (!robot.getDirection().name().equals(setDirection)) {
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            setRobotDirection(robot, "LEFT");
        } else {
            setRobotDirection(robot, "RIGHT");
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            setRobotDirection(robot, "UP");
        } else {
            setRobotDirection(robot, "DOWN");
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
