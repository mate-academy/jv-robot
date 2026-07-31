package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int curX = robot.getX();
        int distanceX = ((toX - curX) < 0) ? ((toX - curX) * -1) : (toX - curX);
        Direction neededDirectionX = (curX < toX) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getDirection() != neededDirectionX) {
            robot.turnLeft();
        }
        for (int i = 1; i <= distanceX; ++i) {
            robot.stepForward();
        }

        int curY = robot.getY();
        int distanceY = ((toY - curY) < 0) ? ((toY - curY) * -1) : (toY - curY);
        Direction neededDirectionY = (curY < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != neededDirectionY) {
            robot.turnLeft();
        }
        for (int i = 1; i <= distanceY; ++i) {
            robot.stepForward();
        }
    }
}
