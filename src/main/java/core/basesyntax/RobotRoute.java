package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceToX = toX - robot.getX();
        int distanceToY = toY - robot.getY();

        if (distanceToX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < distanceToX; i++) {
                robot.stepForward();
            }
        } else if (distanceToX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = 0; i < -distanceToX; i++) {
                robot.stepForward();
            }
        }

        if (distanceToY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = 0; i < distanceToY; i++) {
                robot.stepForward();
            }
        } else if (distanceToY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = 0; i < - distanceToY; i++) {
                robot.stepForward();
            }
        }
    }
}
