package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            moveRobotToX(robot, toX);
        }
        if (robot.getY() != toY) {
            moveRobotToY(robot, toY);
        }

    }

    private void moveRobotToX(Robot robot, int toX) {
        if (toX < robot.getX()) {
            while (robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (toX > robot.getX()) {
            while (robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
    }

    private void moveRobotToY(Robot robot, int toY) {
        if (toY < robot.getY()) {
            while (robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
