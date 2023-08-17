package core.basesyntax;

import javax.management.Descriptor;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int y = robot.getY();
        int x = robot.getX();
        Direction direct = robot.getDirection();
        // VERTICAL STEPS
        if (toY > y) {
            while (direct == direct.UP) {
                robot.turnRight();
            }
            for (int count = 0; count <= toY - y; count++) {
                robot.stepForward();
            }
        } else if (toY < y) {
            while (direct == direct.DOWN) {
                robot.turnRight();
            }
            for (int count = 0; count <= y - toY; count++) {
                robot.stepForward();
            }
        }
        //HORIZONTAL STEPS
        if (toX > x) {
            while (direct == direct.RIGHT) {
                robot.turnRight();
            }
            for (int count = 0; count <= toX - x; count++) {
                robot.stepForward();
            }
        } else if (toX < x) {
            while (direct == direct.LEFT) {
                robot.turnRight();
            }
            for (int count = 0; count <= x - toX; count++) {
                robot.stepForward();
            }
        }

    }
}
