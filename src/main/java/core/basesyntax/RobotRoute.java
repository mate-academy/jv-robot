package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int dX = toX - robot.getX();
        int dY = toY - robot.getY();

        turnRobotCorrectHorizontal(robot, dX);
        moveForvard(robot, Math.abs(dX));
        turnRobotCorrectVertical(robot, dY);
        moveForvard(robot, Math.abs(dY));
    }

    private void turnRobotCorrectHorizontal(Robot robot, int dX) {
        if (dX == 0) {
            return;
        }

        switch (robot.getDirection()) {
            case UP:
                if (dX > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (dX > 0) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (dX > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (dX < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
        }
    }

    private void turnRobotCorrectVertical(Robot robot, int dY) {
        if (dY == 0) {
            return;
        }

        switch (robot.getDirection()) {
            case RIGHT:
                if (dY > 0) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (dY > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (dY > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case UP:
                if (dY < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
        }
    }

    private void moveForvard(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
