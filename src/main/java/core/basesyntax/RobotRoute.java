package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robotReachX(robot, toX);
        robotReachY(robot, toY);
    }

    private void robotReachX(Robot robot, int destinationX) {
        int startDistanceX = Math.abs(robot.getX()) + Math.abs(destinationX);
        while (!robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        }
        robot.stepForward();
        if (Math.abs(robot.getX()) + Math.abs(destinationX) > startDistanceX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }
        }
        while (robot.getX() != destinationX) {
            robot.stepForward();
        }
    }

    private void robotReachY(Robot robot, int destinationY) {
        int startDistanceY = Math.abs(robot.getY()) + Math.abs(destinationY);
        while (!robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        }
        robot.stepForward();
        if (Math.abs(robot.getY()) + Math.abs(destinationY) > startDistanceY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
        }
        while (robot.getY() != destinationY) {
            robot.stepForward();
        }
    }
}
