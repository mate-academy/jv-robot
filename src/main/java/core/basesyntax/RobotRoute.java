package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();

        Direction neededDirectionX = (dx > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction neededDirectionY = (dy > 0) ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != neededDirectionX) {
            robot.turnRight();
        }

        int stepsX = Math.abs(dx);
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }

        while (robot.getDirection() != neededDirectionY) {
            robot.turnLeft();
        }

        int stepsY = Math.abs(dy);
        for (int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }
    }
}
