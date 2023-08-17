package core.basesyntax;

import javax.management.Descriptor;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int y = robot.getY();
        int x = robot.getX();
        Direction direct = robot.getDirection();

        // VERTICAL STEPS
        if (toY > y) {
            while (direct != direct.UP) {
                robot.turnRight();
                direct = robot.getDirection();
            }

            while (toY != y) {
                robot.stepForward();
                y = robot.getY();
            }

        } else if (toY < y) {
            while (direct != direct.DOWN) {
                robot.turnRight();
                direct = robot.getDirection();
            }

            while (toY != y) {
                robot.stepForward();
                y = robot.getY();
            }
        }
        //HORIZONTAL STEPS
        if (toX > x) {

            while (direct != direct.RIGHT) {
                robot.turnRight();
                direct = robot.getDirection();
            }

            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }

        } else if (toX < x) {
            while (direct != direct.LEFT){
                robot.turnRight();
                direct = robot.getDirection();
            }

            while (x != toX) {
                robot.stepForward();
                x = robot.getX();
            }
        }

    }
}
