package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int stepsX = countStepsForward(toX, robot.getX());
        int stepsY = countStepsForward(toY, robot.getY());

        moveHorizontal(robot, stepsX, toX);
        moveVertical(robot, stepsY, toY);
    }

    private int countStepsForward(int startPosition, int endPosition) {
        return endPosition - startPosition;
    }

    private void moveHorizontal(Robot robot, int steps, int toX) {
        if (steps < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveVertical(Robot robot, int steps, int toY) {
        if (steps < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
