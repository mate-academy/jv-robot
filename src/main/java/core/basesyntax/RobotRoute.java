package core.basesyntax;

import org.jetbrains.annotations.NotNull;

public class RobotRoute {
    public void moveRobot(@NotNull Robot robot, int toX, int toY) {
        Direction xdirection = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        Direction ydirection = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (robot.getDirection() != xdirection) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != ydirection) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        System.out.println("Robot reached home");
    }
}
