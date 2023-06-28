package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDir = robot.getDirection();
        if (currentX - toX > 0) {
            while (!currentDir.equals(Direction.LEFT)) {
                robot.turnRight();
                currentDir = robot.getDirection();
            }
            while (currentX - toX > 0) {
                robot.stepForward();
                currentX = robot.getX();
            }
        } else if (currentX - toX < 0) {
            while (!currentDir.equals(Direction.RIGHT)) {
                robot.turnRight();
                currentDir = robot.getDirection();
            }
            while (currentX - toX < 0) {
                robot.stepForward();
                currentX = robot.getX();
            }
        }
        if (currentY - toY > 0) {
            while (!currentDir.equals(Direction.DOWN)) {
                robot.turnRight();
                currentDir = robot.getDirection();
            }
            while (currentY - toY > 0) {
                robot.stepForward();
                currentY = robot.getY();
            }
        } else if (currentY - toY < 0) {
            while (!currentDir.equals(Direction.UP)) {
                robot.turnRight();
                currentDir = robot.getDirection();
            }
            while (currentY - toY < 0) {
                robot.stepForward();
                currentY = robot.getY();
            }
        }
    }
}
