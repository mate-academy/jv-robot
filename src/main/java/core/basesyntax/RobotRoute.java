package core.basesyntax;

public class RobotRoute {
    private void moveRight(Robot robot, int toX) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    private void moveLeft(Robot robot, int toY) {
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        moveRight(robot, toX);
        moveLeft(robot, toY);
    }
}
