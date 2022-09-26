package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX() + (-toX);
        int y = robot.getY() + (-toY);
        if (x < 0) {
            changeDirection(robot, Direction.RIGHT);
            makeMoveX(robot, toX);
        } else if (x > 0) {
            changeDirection(robot, Direction.LEFT);
            makeMoveX(robot, toX);
        }

        if (y < 0) {
            changeDirection(robot, Direction.UP);
            makeMoveY(robot, toY);
        } else if (y > 0) {
            changeDirection(robot, Direction.DOWN);
            makeMoveY(robot, toY);
        }

    }

    private void changeDirection(Robot robot, Direction targetDir) {
        while (!robot.getDirection().equals(targetDir)) {
            robot.turnLeft();
        }
    }

    private void makeMoveX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void makeMoveY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
