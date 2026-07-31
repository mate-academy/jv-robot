package core.basesyntax;

public class RobotRoute {
    private Robot robot;

    private void turnUp() {
        switch (robot.getDirection()) {
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void turnDown() {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                robot.turnRight();
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

    private void turnLeft() {
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnRight();
                robot.turnRight();
                break;
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            default:
                break;
        }
    }

    private void turnRight() {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            default:
                break;
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        this.robot = robot;
        Direction direction = robot.getDirection();
        if (robot.getX() < toX) {
            turnRight();
        } else {
            turnLeft();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            turnUp();
        } else {
            turnDown();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
