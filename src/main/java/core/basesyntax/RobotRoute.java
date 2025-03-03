package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int stepsNumberX = getStepsNumberX(robot, toX);
        int stepsNumberY = getStepsNumberY(robot, toY);
        if (toX < robot.getX()) {
            turnLeftToX(robot, toX);
            for (int i = 0; i < stepsNumberX; i++) {
                robot.stepForward();
            }
            if ((toY < robot.getY())) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            for (int i = 0; i < stepsNumberY; i++) {
                robot.stepForward();
            }
        } else {
            turnRightToX(robot, toX);
            for (int i = 0; i < stepsNumberX; i++) {
                robot.stepForward();
            }
            if ((toY < robot.getY())) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            for (int i = 0; i < stepsNumberY; i++) {
                robot.stepForward();
            }
        }
    }

    private static int getStepsNumberX(Robot robot, int toX) {
        return (robot.getX() * toX > 0) ? Math.abs(robot.getX() - toX)
                : Math.abs(robot.getX()) + Math.abs(toX);
    }

    private static int getStepsNumberY(Robot robot, int toY) {
        return (robot.getY() * toY > 0) ? Math.abs(robot.getY() - toY)
                : Math.abs(robot.getY()) + Math.abs(toY);
    }

    private static void turnLeftToX(Robot robot, int toX) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case LEFT:
                break;
            case DOWN:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private static void turnRightToX(Robot robot, int toX) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case RIGHT:
                break;
            default:
                break;
        }
    }
}
