package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startDistanceX = Math.abs(robot.getX()) + Math.abs(toX);
        int startDistanceY = Math.abs(robot.getY()) + Math.abs(toY);
        while (!robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        }
        robot.stepForward();
        if (Math.abs(robot.getX()) + Math.abs(toX) > startDistanceX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (!robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        }
        robot.stepForward();
        if (Math.abs(robot.getY()) + Math.abs(toY) > startDistanceY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
