package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        moveRobotHorizontally(robot, toX);
        moveRobotVertically(robot, toY);
    }

    private void moveRobotVertically(Robot robot, int toY) {
        Direction needDirection = Direction.UP;
        if (toY - robot.getY() < 0) {
            needDirection = Direction.DOWN;
        }
        while (robot.getDirection() != needDirection) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void moveRobotHorizontally(Robot robot, int toX) {
        Direction needDirection = Direction.RIGHT;
        if (toX - robot.getX() < 0) {
            needDirection = Direction.LEFT;
        }
        while (robot.getDirection() != needDirection) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
