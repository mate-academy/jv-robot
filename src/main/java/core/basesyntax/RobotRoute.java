package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX > currentX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (currentX < toX) {
                robot.stepForward();
                currentX++;
            }
        } else if (toX < currentX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (currentX > toX) {
                robot.stepForward();
                currentX--;
            }
        }
        if (toY > currentY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (currentY < toY) {
                robot.stepForward();
                currentY++;
            }
        } else if (toY < currentY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (currentY > toY) {
                robot.stepForward();
                currentY--;
            }
        }
    }
}

