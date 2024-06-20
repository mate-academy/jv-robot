package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getDirection() == Direction.RIGHT) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getDirection() == Direction.LEFT) {
                robot.stepForward();
            }
        } else {
            System.out.println("coordinate X is OK");
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getDirection() == Direction.DOWN) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robot.getDirection() == Direction.UP) {
                robot.stepForward();
            }
        } else {
            System.out.println("coordinate Y is Ok");
        }
    }
}
