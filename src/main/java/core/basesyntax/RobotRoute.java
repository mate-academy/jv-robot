package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentX = robot.getX();
        if (currentX < toX) {
            turnToDirection(robot,Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (currentX > toX) {
            turnToDirection(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        int currentY = robot.getY();
        if (currentY < toY) {
            turnToDirection(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (currentY > toY) {
            turnToDirection(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    private static void turnToDirection(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}
