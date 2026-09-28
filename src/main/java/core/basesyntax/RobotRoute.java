package core.basesyntax;

public class RobotRoute {

    private boolean hasArrived(Robot robot, int toX, int toY) {
        return robot.getX() == toX && robot.getY() == toY;
    }

    private void performTurn(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (x > toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        } else if (x < toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if (y > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (y < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot == null) {
            return;
        }
        while (!hasArrived(robot, toX, toY)) {
            if (robot.getX() != toX) {
                performTurn(robot, toX, toY);
                robot.stepForward();
            }
            if (robot.getY() != toY) {
                performTurn(robot, toX, toY);
                robot.stepForward();
            }
        }
    }
}
