package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction direction = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;

        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        direction = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
