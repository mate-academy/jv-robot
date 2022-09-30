package core.basesyntax;

public class WayRobotToX {

    public static void MoveTox(Robot robot, int toX) {

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }

        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
