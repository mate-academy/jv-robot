package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() > toX) {
            turnRobotToDirection(robot, Direction.LEFT);
            moveRobotToPoint("x", toX, robot);
        } else {
            turnRobotToDirection(robot, Direction.RIGHT);
            moveRobotToPoint("x", toX, robot);
        }

        if (robot.getY() > toY) {
            turnRobotToDirection(robot, Direction.DOWN);
            moveRobotToPoint("y", toY, robot);
        } else {
            turnRobotToDirection(robot, Direction.UP);
            moveRobotToPoint("y", toY, robot);
        }
    }

    private void moveRobotToPoint(String ax, int to, Robot robot) {
        while (("x".equals(ax) ? robot.getX() : robot.getY()) != to) {
            robot.stepForward();
        }
    }

    private void turnRobotToDirection(Robot robot, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
    }
}
