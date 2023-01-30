package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int stepsX = toX - robot.getX();
        final int stepsY = toY - robot.getY();

        if (stepsX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        if (stepsX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < Math.abs(stepsX); i++) {
            robot.stepForward();
        }
        if (stepsY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        if (stepsY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < Math.abs(stepsY); i++) {
            robot.stepForward();
        }

    }
}

