package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int actX = robot.getX();
        final int actY = robot.getY();
        if (toX != actX || toY != actY) {
            if ((toX > actX)) {
                moveRight(robot, actX, toX);
            } else {
                moveLeft(robot, actX, toX);
            }
            if (toY > actY) {
                moveUp(robot, actY, toY);
            } else {
                moveDown(robot, actY, toY);
            }
        }
    }

    private static void moveRight(Robot robot, int actX, int toX) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                countStepsForward(robot, toX, actX);
                break;
            case LEFT:
                robot.turnDown();
                countStepsForward(robot, toX, actX);
                break;
            case DOWN:
                robot.turnLeft();
                countStepsForward(robot, toX, actX);
                break;
            case RIGHT:
                countStepsForward(robot, toX, actX);
                break;
            default:
                break;
        }
    }

    private static void moveLeft(Robot robot, int actX, int toX) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                countStepsForward(robot, actX, toX);
                break;
            case LEFT:
                countStepsForward(robot, actX, toX);
                break;
            case DOWN:
                robot.turnRight();
                countStepsForward(robot, actX, toX);
                break;
            case RIGHT:
                robot.turnDown();
                countStepsForward(robot, actX, toX);
                break;
            default:
                break;
        }
    }

    private static void moveUp(Robot robot, int actY, int toY) {
        switch (robot.getDirection()) {
            case UP:
                countStepsForward(robot, toY, actY);
                break;
            case LEFT:
                robot.turnRight();
                countStepsForward(robot, toY, actY);
                break;
            case DOWN:
                robot.turnDown();
                countStepsForward(robot, toY, actY);
                break;
            case RIGHT:
                robot.turnLeft();
                countStepsForward(robot, toY, actY);
                break;
            default:
                break;
        }
    }

    private static void moveDown(Robot robot, int actY, int toY) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnDown();
                countStepsForward(robot, actY, toY);
                break;
            case LEFT:
                robot.turnLeft();
                countStepsForward(robot, actY, toY);
                break;
            case DOWN:
                countStepsForward(robot, actY, toY);
                break;
            case RIGHT:
                robot.turnRight();
                countStepsForward(robot, actY, toY);
                break;
            default:
                break;
        }
    }

    private static void countStepsForward(Robot robot, int begin, int end) {
        for (int i = 0; i < (begin - end); i++) {
            robot.stepForward();
        }
    }
}




