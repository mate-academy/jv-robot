package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotToX(robot, toX);
        moveRobotToY(robot, toY);
    }

    private void moveRobotToX(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return;
        }
        Direction firstDirection = defineXDirection(robot.getX(), toX);
        while (robot.getDirection() != firstDirection) {
            robot.turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveRobotToY(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return;
        }
        Direction secondDirection = defineYDirection(robot.getY(), toY);
        while (robot.getDirection() != secondDirection) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private Direction defineXDirection(int x, int toX) {
        return x < toX ? Direction.RIGHT : Direction.LEFT;
    }

    private Direction defineYDirection(int y, int toY) {
        return y < toY ? Direction.UP : Direction.DOWN;
    }
}
