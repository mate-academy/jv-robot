package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int xDestination = Math.abs(robot.getX() - toX);
        final int yDestination = Math.abs(robot.getY() - toY);

        if (toX <= robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0; i < xDestination; i++) {
                robot.stepForward();
            }

            if (toY < robot.getY()) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }

            for (int i = 0; i < yDestination; i++) {
                robot.stepForward();
            }
        } else if (toX >= robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < xDestination; i++) {
                robot.stepForward();
            }

            if (toY < robot.getY()) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }

            for (int i = 0; i < yDestination; i++) {
                robot.stepForward();
            }
        }
    }
}
