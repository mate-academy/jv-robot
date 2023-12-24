package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //  determination of X coordinate
        if (toX < robot.getX()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);
        } else {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);
        }

        int amountStepsX = Math.abs(toX - robot.getX());
        for (int i = 1; i <= amountStepsX; i++) {
            robot.stepForward();
        }

        // determination of Y coordinate
        if (toY < robot.getY()) {
            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
        } else {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
        }

        int amountStepsY = Math.abs(toY - robot.getY());
        for (int j = 1; j <= amountStepsY; j++) {
            robot.stepForward();
        }
    }
}
