package core.basesyntax;

import static core.basesyntax.Direction.UP;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            goEast(toX, robot);
        } else if (toX < robot.getX()) {
            goWest(toX, robot);
        }
        if (toY > robot.getY()) {
            goNorth(toY, robot);
        } else if (toY < robot.getY()) {
            goSouth(toY, robot);
        }
    }

    public void goEast(int x, Robot robot) {
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
        do {
            robot.stepForward();
        } while (x != robot.getX());
    }

    public void goWest(int x, Robot robot) {
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
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }
        do {
            robot.stepForward();
        } while (x != robot.getX());
    }

    public void goNorth(int y, Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                break;
            case LEFT:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                break;
        }
        do {
            robot.stepForward();
        } while (y != robot.getY());
    }

    public void goSouth(int y, Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
        do {
            robot.stepForward();
        } while (y != robot.getY());
    }
}
