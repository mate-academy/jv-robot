package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() - toX > 0 && robot.getY() - toY > 0) {
            moveHorizontal(robot, toX, Direction.LEFT);
            moveVertical(robot, toY, Direction.DOWN);
        } else if (robot.getX() - toX > 0 && robot.getY() - toY < 0) {
            moveHorizontal(robot, toX, Direction.LEFT);
            moveVertical(robot, toY, Direction.UP);
        } else if (robot.getX() - toX < 0 && robot.getY() - toY < 0) {
            moveHorizontal(robot, toX, Direction.RIGHT);
            moveVertical(robot, toY, Direction.UP);
        } else if (robot.getX() - toX < 0 && robot.getY() - toY > 0) {
            moveHorizontal(robot, toX, Direction.RIGHT);
            moveVertical(robot, toY, Direction.DOWN);
        } else if (robot.getX() - toX == 0 && robot.getY() - toY < 0) {
            moveVertical(robot, toY, Direction.UP);
        } else if (robot.getX() - toX == 0 && robot.getY() - toY > 0) {
            moveVertical(robot, toY, Direction.DOWN);
        } else if (robot.getX() - toX > 0 && robot.getY() - toY == 0) {
            moveHorizontal(robot, toX, Direction.LEFT);
        } else if (robot.getX() - toX < 0 && robot.getY() - toY == 0) {
            moveHorizontal(robot, toX, Direction.RIGHT);
        }
    }

    public void moveHorizontal(Robot robot, int coordinateToMoveHorizontal, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
        while (robot.getX() != coordinateToMoveHorizontal) {
            robot.stepForward();
        }
    }

    public void moveVertical(Robot robot, int coordinateToMoveVertical, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
        while (robot.getY() != coordinateToMoveVertical) {
            robot.stepForward();
        }
    }
}
