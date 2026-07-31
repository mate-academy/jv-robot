package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            this.moveToGoal(robot, Direction.RIGHT, toX, true);
        }
        if (robot.getX() > toX) {
            this.moveToGoal(robot, Direction.LEFT, toX, true);
        }

        if (robot.getY() < toY) {
            this.moveToGoal(robot, Direction.UP, toY, false);
        }
        if (robot.getY() > toY) {
            this.moveToGoal(robot, Direction.DOWN, toY, false);
        }
    }

    private void moveToGoal(Robot robot, Direction direction,int targetValue, boolean isX) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        if (isX) {
            while (robot.getX() != targetValue) {
                robot.stepForward();
            }
        } else {
            while (robot.getY() != targetValue) {
                robot.stepForward();
            }
        }

    }
}
