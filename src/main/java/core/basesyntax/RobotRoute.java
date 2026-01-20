package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // write your solution here
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                turnTo(robot, Direction.RIGHT);
            } else {
                turnTo(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                turnTo(robot, Direction.UP);
            } else {
                turnTo(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void turnTo(Robot robot, Direction target) {
        while (robot.getDirection() != target) {
            robot.turnRight();
        }
    }
}
