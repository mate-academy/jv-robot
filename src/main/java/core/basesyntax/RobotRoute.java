package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        do {
            if (robot.getX() < toX) {
                changeDirection(robot, Direction.RIGHT);
            }

            if (robot.getX() > toX) {
                changeDirection(robot, Direction.LEFT);
            }

        } while (robot.getX() != toX);

        do {
            if (robot.getY() < toY) {
                changeDirection(robot, Direction.UP);
            }

            if (robot.getY() > toY) {
                changeDirection(robot, Direction.DOWN);
            }
        } while (robot.getY() != toY);
    }

    public void changeDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
        robot.stepForward();
    }
}
