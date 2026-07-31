package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        reachX(robot, toX);
        reachY(robot, toY);
    }

    private void reachX(Robot robot, int toX) {
        int distanceX = Math.abs(robot.getX() + Math.abs(toX));
        while (!robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        }
        robot.stepForward();
        if (Math.abs(robot.getX() + Math.abs(toX)) > distanceX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void reachY(Robot robot, int toY) {
        int distanceY = Math.abs(robot.getY() + Math.abs(toY));
        while (!robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        }
        robot.stepForward();
        if (Math.abs(robot.getY() + Math.abs(toY)) > distanceY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

}
