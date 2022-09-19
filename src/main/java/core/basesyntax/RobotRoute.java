package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        Direction xDirection = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        turnUntilCorrectDirection(robot, xDirection);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction yDirection = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        turnUntilCorrectDirection(robot, yDirection);
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
