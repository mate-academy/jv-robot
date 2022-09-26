package core.basesyntax;

import static core.basesyntax.Direction.DOWN;
import static core.basesyntax.Direction.LEFT;
import static core.basesyntax.Direction.RIGHT;
import static core.basesyntax.Direction.UP;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int origX = robot.getX();
        int origY = robot.getY();

        if (toX > origX) {
            do {
                robot.turnRight();
            } while (!robot.getDirection().equals(RIGHT));
            do {
                robot.stepForward();
            } while (toX != robot.getX());
        }
        if (toX < origX) {
            do {
                robot.turnLeft();
            } while (!robot.getDirection().equals(LEFT));
            do {
                robot.stepForward();
            } while (toX != robot.getX());
        }

        if (toY < origY) {
            do {
                robot.turnRight();
            } while (!robot.getDirection().equals(DOWN));
            do {
                robot.stepForward();
            } while (toY != robot.getY());
        }
        if (toY > origY) {
            do {
                robot.turnRight();
            } while (!robot.getDirection().equals(UP));
            do {
                robot.stepForward();
            } while (toY != robot.getY());
        }

    }
}
