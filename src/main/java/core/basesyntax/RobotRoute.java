package core.basesyntax;

public class RobotRoute {
    private Direction presentDirection;

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        searchY(robot, toY);
        searchX(robot, toX);
    }

    private void searchY(Robot robot, int toY) {
        int presentY = robot.getY();
        presentDirection = robot.getDirection();
        while (presentY != toY) {
            if (presentY < toY) {
                while (presentDirection != Direction.UP) {
                    robot.turnRight();
                    presentDirection = robot.getDirection();
                }
                robot.stepForward();
                presentY++;
            } else if (presentY > toY) {
                while (presentDirection != Direction.DOWN) {
                    robot.turnLeft();
                    presentDirection = robot.getDirection();
                }
                robot.stepForward();
                presentY--;
            }
        }
    }

    private void searchX(Robot robot, int toX) {
        int presentX = robot.getX();
        presentDirection = robot.getDirection();
        while (presentX != toX) {
            if (presentX < toX) {
                while (presentDirection != Direction.RIGHT) {
                    robot.turnRight();
                    presentDirection = robot.getDirection();
                }
                robot.stepForward();
                presentX++;
            } else if (presentX > toX) {
                while (presentDirection != Direction.LEFT) {
                    robot.turnLeft();
                    presentDirection = robot.getDirection();
                }
                robot.stepForward();
                presentX--;
            }
        }
    }
}
