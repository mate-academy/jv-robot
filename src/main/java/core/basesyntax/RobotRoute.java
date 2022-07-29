package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        turnToDirectionX(robot, toX);
        moveToX(robot, toX);
        turnToDirectionY(robot, toY);
        moveToY(robot, toY);
    }

    private void turnToDirectionX(Robot robot, int toX) {
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void turnToDirectionY(Robot robot, int toY) {
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
    }

    private void moveToX(Robot robot, int toX) {
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

    private void moveToY(Robot robot, int toY) {
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
