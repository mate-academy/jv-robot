package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < 0) {
            for (int i = 0; i > toX; i--) {
                robot.turnLeft();
            }
        }
        if (toX > 0) {
            for (int i = 0; i < toX; i++) {
                robot.turnRight();
            }
        }
        if (toY < 0) {
            for (int i = 0; i > toY; i--) {
                robot.stepForward();
            }
        }
    }
}
