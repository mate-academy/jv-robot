package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX > currentX) {
            rotateTo(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (toX < currentX) {
            rotateTo(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        if (toY > currentY) {
            rotateTo(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (toY < currentY) {
            rotateTo(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }

    private void rotateTo(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
