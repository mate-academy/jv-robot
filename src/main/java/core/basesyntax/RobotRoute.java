package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveHorizon(robot, toX);
        moveVertical(robot, toY);
    }

    private boolean moveRight(Robot robot, int toX) {
        return robot.getX() < toX;
    }

    private boolean moveUp(Robot robot, int toY) {
        return robot.getY() < toY;
    }

    private void prepToRight(Robot robot) {
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
            default:
                break;
        }
    }

    private void prepToLeft(Robot robot) {
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

    private void prepToUp(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void prepToDown(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    private void moveHorizon(Robot robot, int toX) {
        if (moveRight(robot, toX)) {
            prepToRight(robot);
        } else {
            prepToLeft(robot);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveVertical(Robot robot, int toY) {
        if (moveUp(robot, toY)) {
            prepToUp(robot);
        } else {
            prepToDown(robot);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
