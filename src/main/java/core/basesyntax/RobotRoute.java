package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = currentX; i < toX; i++) {
                robot.stepForward();
            }
        } else if (currentX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = currentX; i > toX; i--) {
                robot.stepForward();
            }
        }

        if (currentY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = currentY; i < toY; i++) {
                robot.stepForward();
            }
        } else if (currentY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = currentY; i > toY; i--) {
                robot.stepForward();
            }
        }
    }
}
