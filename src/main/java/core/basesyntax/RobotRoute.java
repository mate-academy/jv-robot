package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX > currentX) {
            turnToDirection(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (toX < currentX) {
            turnToDirection(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        if (toY > currentY) {
            turnToDirection(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (toY < currentY) {
            turnToDirection(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnLeft();
            robot.turnRight();
        }
    }
}
