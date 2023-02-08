package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //move on X-axis
        if (robot.getX() > toX) {
            turnToDirection(robot, Direction.LEFT);
            go(robot, robot.getX() - toX);
        } else if (robot.getX() < toX) {
            turnToDirection(robot, Direction.RIGHT);
            go(robot, toX - robot.getX());
        }

        //move on Y-axis
        if (robot.getY() > toY) {
            turnToDirection(robot, Direction.DOWN);
            go(robot, robot.getY() - toY);
        } else if (robot.getY() < toY) {
            turnToDirection(robot, Direction.UP);
            go(robot, toY - robot.getY());
        }
    }

    private void turnToDirection(Robot robot, Direction dir) {
        int dirDifference = dir.ordinal() - robot.getDirection().ordinal();

        if (dirDifference == 1 || dirDifference == -3) {
            robot.turnRight();
        } else if (dirDifference == -1 || dirDifference == 3) {
            robot.turnLeft();
        } else if (dirDifference == 2 || dirDifference == -2) {
            robot.turnRight();
            robot.turnRight();
        }
    }

    private void go(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
