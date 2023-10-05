package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int x = robot.getX();
        int y = robot.getY();
        if (x < toX) {
            turnRobot(robot,Direction.RIGHT);
        } else {
            turnRobot(robot,Direction.LEFT);
        }
        for (int i = 0; i < Math.abs(x - toX);i++) {
            robot.stepForward();
        }
        if (y < toY) {
            turnRobot(robot,Direction.UP);
        } else {
            turnRobot(robot,Direction.DOWN);
        }
        for (int i = 0; i < Math.abs(y - toY);i++) {
            robot.stepForward();
        }
    }

    private void turnRobot(Robot robot, Direction needDirection) {
        while (robot.getDirection() != needDirection) {
            robot.turnRight();
        }
    }
}
