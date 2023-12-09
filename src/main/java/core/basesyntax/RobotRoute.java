package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int coordinateX = robot.getX() - toX;
        int coordinateY = robot.getY() - toY;
        if (coordinateY < 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (coordinateY > 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        if (coordinateX < 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (coordinateX > 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
    }
}
