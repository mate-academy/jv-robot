package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // rotate robot based on X
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                turnOver(robot, Direction.LEFT);
            } else if (robot.getX() < toX) {
                turnOver(robot, Direction.RIGHT);
            }
            robot.stepForward();
        }
        // rotate robot based on Y
        if (robot.getY() > toY) {
            turnOver(robot, Direction.DOWN);
        } else if (robot.getY() < toY) {
            turnOver(robot, Direction.UP);
        }
        // moving robot on Y axis
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void turnOver(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            if (targetDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
    }
}
