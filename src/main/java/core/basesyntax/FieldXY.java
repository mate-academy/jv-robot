package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        turnRobotToTarget(robot, robot.getX(), toX, Direction.RIGHT, Direction.LEFT);
        moveRobotToTarget(robot,robot.getX(), toX);
        turnRobotToTarget(robot, robot.getY(), toY, Direction.UP, Direction.DOWN);
        moveRobotToTarget(robot,robot.getY(), toY);
    }

    private void turnRobotToTarget(Robot robot, int position, int target,
                                  Direction direction1, Direction direction2) {
        if (position < target) {
            while (robot.getDirection() != direction1) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != direction2) {
                robot.turnLeft();
            }
        }
    }

    private void moveRobotToTarget(Robot robot, int position, int target) {
        while (position != target) {
            robot.stepForward();
            position = getPosition(robot);
        }
    }

    private int getPosition(Robot robot) {
        if (robot.getDirection() == Direction.LEFT || robot.getDirection() == Direction.RIGHT) {
            return robot.getX();
        }
        return robot.getY();
    }
}

