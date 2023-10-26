package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotOnX(robot,toX);
        moveRobotOnY(robot, toY);
    }

    private void moveRobotOnX(Robot robot, int toX) {
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

    private void moveRobotOnY(Robot robot, int toY) {
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
}
