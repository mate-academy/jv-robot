package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            int subX = toX - robot.getX();
            int subY = toY - robot.getY();

            Direction needDirection = robot.getDirection();

            if (subX > 0) {
                needDirection = Direction.RIGHT;
            } else if (subX < 0) {
                needDirection = Direction.LEFT;
            } else if (subY > 0) {
                needDirection = Direction.UP;
            } else if (subY < 0) {
                needDirection = Direction.DOWN;
            }
            turnRobotToDirection(robot, needDirection);

            robot.stepForward();
        }
    }

    private void turnRobotToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
