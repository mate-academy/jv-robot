package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        turnRobotCorrectHorizontal(robot, deltaX);
        moveForvard(robot, Math.abs(deltaX));
        turnRobotCorrectVertical(robot, deltaY);
        moveForvard(robot, Math.abs(deltaY));
    }

    private void turnRobotCorrectHorizontal(Robot robot, int deltaX) {
        if (deltaX == 0) {
            return;
        }

        switch (robot.getDirection()) {
            case UP:
                if (deltaX > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (deltaX > 0) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (deltaX > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (deltaX < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            default:
                System.out.println("impossible");
        }
    }

    private void turnRobotCorrectVertical(Robot robot, int deltaY) {
        if (deltaY == 0) {
            return;
        }

        switch (robot.getDirection()) {
            case RIGHT:
                if (deltaY > 0) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (deltaY > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (deltaY > 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            case UP:
                if (deltaY < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            default:
                System.out.println("impossible");
        }
    }

    private void moveForvard(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
