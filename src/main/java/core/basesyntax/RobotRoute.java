package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveX(robot, toX);
        moveY(robot, toY);
    }

    private Direction determineDeractionAxisX(Robot robot, int expectedX) {
        if (expectedX > robot.getX()) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }

    private Direction determineDeractionAxisY(Robot robot, int expectedY) {
        if (expectedY > robot.getY()) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }

    private void moveX(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return;
        }

        Direction expectedDirectionX = determineDeractionAxisX(robot, toX);

        while (expectedDirectionX != robot.getDirection()) {
            robot.turnLeft();
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    private void moveY(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return;
        }

        Direction expectedDirectionY = determineDeractionAxisY(robot, toY);

        while (expectedDirectionY != robot.getDirection()) {
            robot.turnLeft();
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
