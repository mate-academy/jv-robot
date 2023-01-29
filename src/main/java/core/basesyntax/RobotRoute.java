package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        if (toX > currentX) {
            while (currentDirection != Direction.RIGHT) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            for (int i = 0; i < toX - currentX; i++) {
                robot.stepForward();
            }
        }
        if (toX < currentX) {
            while (currentDirection != Direction.LEFT) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            for (int i = 0; i < currentX - toX; i++) {
                robot.stepForward();
            }
        }
        if (currentY > toY) {
            while (currentDirection != Direction.DOWN) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            for (int i = 0; i < currentY - toY; i++) {
                robot.stepForward();
            }
        }
        if (currentY < toY) {
            while (currentDirection != Direction.UP) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            for (int i = 0; i < toY - currentY; i++) {
                robot.stepForward();
            }
        }
    }
}
