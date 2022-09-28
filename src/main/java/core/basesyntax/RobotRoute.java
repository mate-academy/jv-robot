package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int postionX = robot.getX();
        int positionY = robot.getY();
        Direction direction = positionY > toY ? Direction.DOWN : Direction.UP;
        while (direction != robot.getDirection()) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        direction = postionX > toX ? Direction.LEFT : Direction.RIGHT;
        while (direction != robot.getDirection()) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
