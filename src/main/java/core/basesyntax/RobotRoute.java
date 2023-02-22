package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
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
            case LEFT:
            default:
                break;
        }

        if (robot.getX() > toX) {
            moveLeft(robot, toX, toY);
        } else {
            robot.turnRight();
            robot.turnRight();
            moveRight(robot, toX, toY);
        }
    }

    public void moveLeft(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void moveRight(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();

        }
    }
}
