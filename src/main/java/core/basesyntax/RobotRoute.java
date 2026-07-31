package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        rotate(robot, x, toX, Direction.RIGHT, Direction.LEFT);

        while (x != toX) {
            robot.stepForward();
            x = robot.getX();
        }

        rotate(robot, y, toY, Direction.UP, Direction.DOWN);

        while (y != toY) {
            robot.stepForward();
            y = robot.getY();
        }
    }

    private void rotate(Robot robot, int currentCoordinate, int targetCoordinate,
                        Direction positiveDirection, Direction negativeDirection) {

        if (currentCoordinate < targetCoordinate) {
            while (robot.getDirection() != positiveDirection) {
                robot.turnRight();
            }
        } else if (currentCoordinate > targetCoordinate) {
            while (robot.getDirection() != negativeDirection) {
                robot.turnLeft();
            }
        }

    }
}
