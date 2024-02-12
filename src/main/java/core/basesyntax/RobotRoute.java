package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int deltaX = currentX - toX;
        int deltaY = currentY - toY;

        if (deltaX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (deltaX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (currentX != toX) {
            robot.stepForward();
            currentX += (deltaX > 0) ? 1 : -1;
        }
        if (deltaY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (deltaY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (currentY != toY) {
            robot.stepForward();
            currentY += (deltaY > 0) ? 1 : -1;
        }
    }
}
