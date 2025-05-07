package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        placeRobotToX(robot, toX);
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        placeRobotToY(robot, toY);
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

    private void placeRobotToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }
        }
    }

    private void placeRobotToY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        } else {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
        }
    }
}
