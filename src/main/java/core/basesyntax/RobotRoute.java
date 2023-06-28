package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        changeMoveDirection(robot, toX, toY);
        while (true) {
            robot.stepForward();
            if (robot.getX() == toX || robot.getY() == toY) {
                break;
            }
        }
        changeMoveDirection(robot, toX, toY);
        while ((robot.getX() != toX) || (robot.getY() != toY)) {
            robot.stepForward();
        }
    }

    /* turn to right direction if need direction ↖ or ↙,
    ↗ or ↘,
    ↓, ↑, ➝, ←
    */
    public void changeMoveDirection(Robot robot, int toX, int toY) {

        if ((robot.getX() > toX) && (robot.getY() > toY)
                || (robot.getX() > toX) && (robot.getY() < toY)) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if ((robot.getX() < toX) && (robot.getY() < toY)
                || (robot.getX() < toX) && (robot.getY() > toY)) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if ((robot.getX() == toX) && (robot.getY() > toY)) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if ((robot.getX() == toX) && (robot.getY() < toY)) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if ((robot.getX() < toX) && (robot.getY() == toY)) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if ((robot.getX() > toX) && (robot.getY() == toY)) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
    }
}
