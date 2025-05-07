package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        int diffX = toX - currentX;
        int diffY = toY - currentY;

        while (diffX != 0 || diffY != 0) {
            if (diffX > 0) {
                if (robot.getDirection() != Direction.RIGHT) {
                    turnRobotToDirection(robot, Direction.RIGHT);
                }
                robot.stepForward();
                diffX--;
            } else if (diffX < 0) {
                if (robot.getDirection() != Direction.LEFT) {
                    turnRobotToDirection(robot, Direction.LEFT);
                }
                robot.stepForward();
                diffX++;
            } else if (diffY > 0) {
                if (robot.getDirection() != Direction.UP) {
                    turnRobotToDirection(robot, Direction.UP);
                }
                robot.stepForward();
                diffY--;
            } else if (diffY < 0) {
                if (robot.getDirection() != Direction.DOWN) {
                    turnRobotToDirection(robot, Direction.DOWN);
                }
                robot.stepForward();
                diffY++;
            }

        }
    }

    private void turnRobotToDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}
