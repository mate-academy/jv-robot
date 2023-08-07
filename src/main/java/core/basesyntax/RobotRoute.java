package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX == robot.getX() && toY == robot.getY()) {
            return;
        }
        moveX(robot, toX);
        moveY(robot, toY);
    }

    private void moveX(Robot robot, int toX) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    private void moveY(Robot robot, int toY) {
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }

}
