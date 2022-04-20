package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX >= robot.getX() && toY >= robot.getY()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX > robot.getX()) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (toY > robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX <= robot.getX() && toY >= robot.getY()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX < robot.getX()) {
                robot.stepForward();
            }
            robot.turnRight();
            while (toY > robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX >= robot.getX() && toY <= robot.getY()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX > robot.getX()) {
                robot.stepForward();
            }
            robot.turnRight();
            while (toY < robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX <= robot.getX() && toY <= robot.getY()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX < robot.getX()) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (toY < robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
