package core.basesyntax;

public class RobotRoute {

    private void moveRobotToX(Robot robot, int toX) {
        int distanceX = Math.abs(robot.getX() - toX);
        if (toX < robot.getX()) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
        }
        while (distanceX != 0) {
            robot.stepForward();
            distanceX = Math.abs(robot.getX() - toX);
        }
    }

    private void moveRobotToY(Robot robot, int toY) {
        int distanceY = Math.abs(robot.getY() - toY);
        if (toY < robot.getY()) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
        }
        while (distanceY != 0) {
            robot.stepForward();
            distanceY = Math.abs(robot.getY() - toY);
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        moveRobotToX(robot, toX);
        moveRobotToY(robot, toY);
    }
}
