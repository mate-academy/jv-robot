package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX) {
                moveAxis(robot, toX, true);
            }
            if (robot.getY() != toY) {
                moveAxis(robot, toY, false);
            }
        }
    }

    private void moveAxis(Robot rob, int target, boolean isAxisX) {
        Direction targetDirection = this.getTargetDirection(rob, target, isAxisX);
        this.turnRobotToRightDirection(rob, targetDirection);
        rob.stepForward();
    }

    private Direction getTargetDirection(Robot rob, int target, boolean isAxisX) {
        return isAxisX ? rob.getX() > target ? Direction.LEFT : Direction.RIGHT : rob.getY() > target ? Direction.DOWN : Direction.UP;
    }

    private void turnRobotToRightDirection(Robot rob, Direction targetDirection) {
        while (rob.getDirection() != targetDirection) {
            rob.turnRight();
        }
    }
}
