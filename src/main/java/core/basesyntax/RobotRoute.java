package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        if (currentX > toX) {
            while (currentDirection != Direction.LEFT) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            while (currentX != toX) {
                robot.stepForward();
                currentX = robot.getX();
            }
        }

        if (currentX < toX) {
            while (currentDirection != Direction.RIGHT) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
            while (currentX != toX) {
                robot.stepForward();
                currentX = robot.getX();
            }
        }

        if (currentY > toY) {
            while (currentDirection != Direction.DOWN) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
            while (currentY != toY) {
                robot.stepForward();
                currentY = robot.getY();
            }
        }

        if (currentY < toY) {
            while (currentDirection != Direction.UP) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
            while (currentY != toY) {
                robot.stepForward();
                currentY = robot.getY();
            }
        }
    }
}
