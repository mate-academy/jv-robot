package core.basesyntax;

import static core.basesyntax.Direction.*;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int numberOfStepsX = robot.getX() - toX;
        int numberOfStepsY = robot.getY() - toY;
        if (numberOfStepsX > 0) {
            while (robot.getDirection() != RIGHT) {
                robot.turnRight();
            }
        }
        if (numberOfStepsX < 0) {
            while (robot.getDirection() != LEFT) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < Math.abs(numberOfStepsX); i++) {
            robot.stepForward();
        }
        if (numberOfStepsY > 0) {
            while (robot.getDirection() != DOWN) {
                robot.turnRight();
            }
            if (numberOfStepsY < 0) {
                while (robot.getDirection() != UP) {
                    robot.turnLeft();
                }
            for (int j = 0; j < Math.abs(numberOfStepsY); j++) {
                robot.stepForward();
            }

            }
        }
    }
}
