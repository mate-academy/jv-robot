package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) { // x = 3, y = 1 for example
        //write your solution here
        int dx = toX - robot.getX();;
        int dy = toY - robot.getY();;

        if (dx != 0) {
            Direction xDir = dx > 0 ? Direction.RIGHT : Direction.LEFT;
            turnRobotTo(robot, xDir);
            for (int i = 0; i < Math.abs(dx); i++) {
                robot.stepForward();
            }
        }

        if (dy != 0) {
            Direction yDir = dy > 0 ? Direction.UP : Direction.DOWN;
            turnRobotTo(robot, yDir);
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
