package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // x
        int subtractionX = robot.getX() - toX;
        if (subtractionX < 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(subtractionX); i++) {
                robot.stepForward();
            }
        } else if (subtractionX > 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            for (int i = 0; i < subtractionX; i++) {
                robot.stepForward();
            }
        }

        // y
        int subtractionY = robot.getY() - toY;
        if (subtractionY < 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(subtractionY); i++) {
                robot.stepForward();
            }
        } else if (subtractionY > 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = 0; i < subtractionY; i++) {
                robot.stepForward();
            }
        }
    }
}
