package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        //1. ищем по координатам x.
        Direction direction = toX < robot.getX() ? Direction.LEFT : Direction.RIGHT;
        if (toX != robot.getX()) {
            while (!direction.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        //2. ищем по координатам y.
        direction = toY < robot.getY() ? Direction.DOWN : Direction.UP;
        if (toY != robot.getY()) {
            while (!direction.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
