package core.basesyntax;

public class WayRobotToY {

    public static void moveToY(Robot robot, int toY) {

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
