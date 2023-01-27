package core.basesyntax;

import org.jetbrains.annotations.NotNull;

import static core.basesyntax.Direction.*;

public class RobotRoute {

    public void moveRobot(@NotNull Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() < toX) {
            if (robot.getDirection() != RIGHT) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getX() > toX) {
            if (robot.getDirection() != LEFT) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getY() < toY) {
            if (robot.getDirection() != UP) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (robot.getY() > toY) {
            if (robot.getDirection() != DOWN) {
                robot.turnLeft();
            } else {
                robot.stepForward();
            }
        }
    }
}
