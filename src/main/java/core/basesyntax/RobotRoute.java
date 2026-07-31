package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (currentX < toX) {
                robot.stepForward();
                currentX++;
            }
        } else if (currentX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (currentX > toX) {
                robot.stepForward();
                currentX--;
            }
        }
        if (currentY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (currentY < toY) {
                robot.stepForward();
                currentY++;
            }
        } else if (currentY > toY) {
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
