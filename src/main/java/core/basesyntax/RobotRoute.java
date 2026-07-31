package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX > currentX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (toX < currentX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (toY > currentY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (toY < currentY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}
