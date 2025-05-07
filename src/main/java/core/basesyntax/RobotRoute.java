package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //moving robot based on X axis
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                turnRobot(robot, Direction.RIGHT);
            } else if (robot.getX() > toX) {
                turnRobot(robot, Direction.LEFT);
            }
            robot.stepForward();
        }
        //moving robot based on Y axis
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                turnRobot(robot, Direction.UP);
            } else if (robot.getY() > toY) {
                turnRobot(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    public void turnRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            if (targetDirection == Direction.RIGHT) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
    }
}
