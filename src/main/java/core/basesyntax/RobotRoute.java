package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    turnToDirection(robot, Direction.UP);
                }
                robot.stepForward();
            } else if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    turnToDirection(robot, Direction.DOWN);
                }
                robot.stepForward();
            }
        }

        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    turnToDirection(robot, Direction.RIGHT);
                }
                robot.stepForward();
            } else if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    turnToDirection(robot, Direction.LEFT);
                }
                robot.stepForward();
            }
        }
    }

    private void turnToDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}


