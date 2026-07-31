package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongY(robot, toY);
        moveAlongX(robot, toX);
    }

    private Direction getTargetDirectionForY(int currentY, int targetY) {

        if (currentY < targetY) {
            return Direction.UP;
        } else {
            return Direction.DOWN;
        }
    }

    private Direction getTargetDirectionForX(int currentX, int targetX) {

        if (currentX < targetX) {
            return Direction.RIGHT;
        } else {
            return Direction.LEFT;
        }
    }

    private void turnRobotTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        Direction targetDirection = getTargetDirectionForY(robot.getY(), toY);
        turnRobotTo(robot, targetDirection);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void moveAlongX(Robot robot, int toX) {
        Direction targetDirection = getTargetDirectionForX(robot.getX(), toX);
        turnRobotTo(robot, targetDirection);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

}
