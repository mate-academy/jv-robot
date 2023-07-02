package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (toX > robot.getX()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (toX < robot.getX()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.LEFT);
            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }
        if (toY > robot.getY()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
        if (toY < robot.getY()) {
            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.DOWN);
            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}
