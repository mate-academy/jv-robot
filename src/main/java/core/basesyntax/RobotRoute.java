package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        alignedXPos(robot, toX);
        alignedYPos(robot, toY);
    }

    private void alignedYPos(Robot robot, int toY) {
        if (robot.getY() > toY) {
            moveRobotOnY(robot, toY, Direction.DOWN);
        }
        if (robot.getY() < toY) {
            moveRobotOnY(robot, toY, Direction.UP);
        }
    }

    private void moveRobotOnY(Robot robot, int toY, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void alignedXPos(Robot robot, int toX) {
        if (robot.getX() > toX) {
            moveRobotOnX(robot, toX, Direction.LEFT);
        }
        if (robot.getX() < toX) {
            moveRobotOnX(robot, toX, Direction.RIGHT);
        }
    }

    private void moveRobotOnX(Robot robot, int toX, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
