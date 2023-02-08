package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX()) {
            if (toX < robot.getX() && robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            } else if (toX > robot.getX() && robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
        while (toY != robot.getY()) {
            if (toY < robot.getY() && robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            } else if (toY > robot.getY() && robot.getDirection() != Direction.UP) {
                robot.turnRight();
            } else {
                robot.stepForward();
            }
        }
    }
}
