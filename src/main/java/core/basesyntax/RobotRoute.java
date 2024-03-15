package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (!Direction.LEFT.equals(robot.getDirection())) {
                robot.turnRight();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (toX > robot.getX()) {
            while (!Direction.RIGHT.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (toY < robot.getY()) {
            while (!Direction.DOWN.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toY >= robot.getY()) {
            while (!Direction.UP.equals(robot.getDirection())) {
                robot.turnRight();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }
}
