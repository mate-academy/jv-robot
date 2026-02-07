package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {

            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);

        } else {

            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);

        }

        do {
            robot.stepForward();
        } while (robot.getX() != toX);

        if (robot.getY() > toY) {

            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);

        } else {

            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.DOWN);

        }

        do {
            robot.stepForward();
        } while (robot.getY() != toY);
    }
}
