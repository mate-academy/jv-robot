package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }
        Direction whereToX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        while (!robot.getDirection().equals(whereToX)) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        Direction whereToY = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        while (!robot.getDirection().equals(whereToY)) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
