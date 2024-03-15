package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX || currentY != toY) {
            if (currentX < toX) {
                moveToTargetX(robot, Direction.RIGHT);
                currentX++;
            } else if (currentX > toX) {
                moveToTargetX(robot, Direction.LEFT);
                currentX--;
            }

            if (currentY < toY) {
                moveToTargetY(robot, Direction.UP);
                currentY++;
            } else if (currentY > toY) {
                moveToTargetY(robot, Direction.DOWN);
                currentY--;
            }
        }
    }

    private void moveToTargetX(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
        robot.stepForward();
    }

    private void moveToTargetY(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnLeft();
        }
        robot.stepForward();
    }
}
