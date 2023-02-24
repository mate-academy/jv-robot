package core.basesyntax;

import org.jetbrains.annotations.NotNull;

public class RobotRoute {
    public void moveRobot(@NotNull Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int diffX = toX - currentX;
        int diffY = toY - currentY;

        while (diffX != 0 || diffY != 0) {
            if (diffX > 0) {
                robot.turnRight();
                robot.stepForward();
                diffX--;
            } else if (diffX < 0) {
                robot.turnLeft();
                robot.stepForward();
                diffY++;
            }
            if (diffY > 0) {
                robot.turnRight();
                robot.stepForward();
                diffY--;
            } else if (diffY < 0) {
                robot.turnLeft();
                robot.stepForward();
                diffY++;
            }
        }
    }
}
