package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction correctXDirection = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        turnUntilCorrectDirection(robot, correctXDirection);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction correctYDirection = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        turnUntilCorrectDirection(robot, correctYDirection);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnUntilCorrectDirection(Robot robot, Direction correctDirection) {
        while (robot.getDirection() != correctDirection) {
            robot.turnLeft();
        }
    }
}
