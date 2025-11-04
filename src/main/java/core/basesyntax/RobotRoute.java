package core.basesyntax;

public class RobotRoute {
    // helper: index for direction (UP=0, RIGHT=1, DOWN=2, LEFT=3)
    private int dirIndex(Direction d) {
        return switch (d) {
            case UP -> 0;
            case RIGHT -> 1;
            case DOWN -> 2;
            case LEFT -> 3;
        };
    }

    // rotate to target direction using minimal turns
    private void rotateRobot(Robot robot, Direction targetDirection) {
        int currentDirIndex = dirIndex(robot.getDirection());
        int targetDirIndex = dirIndex(targetDirection);
        int rightTurns = (targetDirIndex - currentDirIndex + 4) % 4;
        int leftTurns = (currentDirIndex - targetDirIndex + 4) % 4;

        if (rightTurns <= leftTurns) {
            for (int i = 0; i < rightTurns; i++) {
                robot.turnRight();
            }
        } else {
            for (int i = 0; i < leftTurns; i++) {
                robot.turnLeft();
            }
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = toX - robot.getX();
        int distanceY = toY - robot.getY();

        if (distanceX != 0) {
            Direction targetDirection = distanceX > 0 ? Direction.RIGHT : Direction.LEFT;
            rotateRobot(robot, targetDirection);
            for (int i = 0; i < Math.abs(distanceX); i++) {
                robot.stepForward();
            }
        }

        if (distanceY != 0) {
            Direction targetDirection = distanceY > 0 ? Direction.UP : Direction.DOWN;
            rotateRobot(robot, targetDirection);
            for (int i = 0; i < Math.abs(distanceY); i++) {
                robot.stepForward();
            }
        }
    }
}
