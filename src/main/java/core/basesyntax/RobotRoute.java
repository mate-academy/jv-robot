package core.basesyntax;

import static java.lang.Math.abs;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int moveX = toX - robot.getX();
        int moveY = toY - robot.getY();

        if (moveX < 0) {
            robot.moveLeft();
            for (int i = 0; i < abs(moveX); i++) {
                robot.stepForward();
            }
        } else {
            robot.moveRight();
            for (int i = 0; i < abs(moveX); i++) {
                robot.stepForward();
            }
        }

        if (moveY < 0) {
            robot.moveDown();
            for (int i = 0; i < abs(moveY); i++) {
                robot.stepForward();
            }
        } else {
            robot.moveUp();
            for (int i = 0; i < abs(moveY); i++) {
                robot.stepForward();
            }
        }
    }
}
