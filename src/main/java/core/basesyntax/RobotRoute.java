package core.basesyntax;

import static core.basesyntax.Direction.DOWN;
import static core.basesyntax.Direction.LEFT;
import static core.basesyntax.Direction.RIGHT;
import static core.basesyntax.Direction.UP;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int numberOfStepsX = robot.getX() - toX;
        if (numberOfStepsX > 0) {
            while (robot.getDirection() != LEFT) {
                robot.turnRight();
            }
        }
        if (numberOfStepsX < 0) {
            while (robot.getDirection() != RIGHT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        int numberOfStepsY = robot.getY() - toY;
        if (numberOfStepsY > 0) {
            while (robot.getDirection() != DOWN) {
                robot.turnRight();
            }
        }
        if (numberOfStepsY < 0) {
            while (robot.getDirection() != UP) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}





