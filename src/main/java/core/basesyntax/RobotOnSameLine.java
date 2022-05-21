package core.basesyntax;

public class RobotOnSameLine {
    public void onSameLine(Robot robot, int toX, int toY) {

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }
}
