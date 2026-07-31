package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirection = robot.getDirection();
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (currentX - toX > 0) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (currentX != toX) {
                robot.stepForward();
                currentX--;
            }

        } else {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
            while (currentX != toX) {
                robot.stepForward();
                currentX++;
            }
        }

        if (currentY - toY > 0) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            while (currentY != toY) {
                robot.stepForward();
                currentY--;
            }
        } else {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (currentY != toY) {
                robot.stepForward();
                currentY++;
            }
        }

        //write your solution here
    }
}
