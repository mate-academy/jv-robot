package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private Direction targetdirection;

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();
        while (currentX != toX || currentY != toY) {
            if (currentX < toX) {
                moveTowards(robot, Direction.RIGHT);
                currentX++;
            } else if (currentX > toX) {
                moveTowards(robot, Direction.LEFT);
                currentX--;
            }
            if (currentY < toY) {
                moveTowards(robot, Direction.UP);
                currentY++;
            } else if (currentY > toY) {
                moveTowards(robot, Direction.DOWN);
                currentY--;
            }
        }
    }

    public void moveTowards(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            rotateToDirection(robot, targetDirection);
        }
        robot.stepForward();
    }

    public void rotateToDirection(Robot robot, Direction targetDirection) {
        Direction currentDirection = robot.getDirection();
        while (currentDirection != targetDirection) {
            robot.turnLeft();
            currentDirection = robot.getDirection();
        }
    }
}
