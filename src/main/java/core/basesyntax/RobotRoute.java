package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int fromY = robot.getY();
        int fromX = robot.getX();
        int targetDistanceX = fromX - toX;
        int targetDistanceY = fromY - toY;
        Direction targetDirectionX = Direction.LEFT;
        Direction targetDirectionY = Direction.DOWN;
        if (targetDistanceX < 0) {
            targetDirectionX = Direction.RIGHT;
        }
        if (targetDistanceY < 0) {
            targetDirectionY = Direction.UP;
        }
        while (targetDirectionX != robot.getDirection()) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (targetDirectionY != robot.getDirection()) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
