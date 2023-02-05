package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            turnRobotToLeft(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getX() < toX) {
            turnRobotToRight(robot);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            turnRobotToDown(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            turnRobotToUp(robot);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }

    private void turnRobotToLeft(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
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

    private void turnRobotToRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
            case DOWN:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void turnRobotToUp(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void turnRobotToDown(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case UP:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
    }
}
