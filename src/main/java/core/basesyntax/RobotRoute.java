package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) { // x = 3, y = 1 for example
        //write your solution here
        int dx = toX - robot.getX();
        int dy = toY - robot.getY();

        if (dx != 0) {
            Direction dirX = dx > 0 ? Direction.RIGHT : Direction.LEFT;
            turnRobotTo(robot, dirX);
            for (int i = 0; i < Math.abs(dx); i++) {
                robot.stepForward();
            }
        }

        if (dy != 0) {
            Direction dirY = dy > 0 ? Direction.UP : Direction.DOWN;
            turnRobotTo(robot, dirY);
            for (int i = 0; i < Math.abs(dy); i++) {
                robot.stepForward();
            }
        }

    }

    public static void turnRobotTo(Robot robot, Direction targetDir) {
        while (robot.getDirection() != targetDir) {
            robot.turnRight();
        }
    }
}
