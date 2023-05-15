package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            Direction directionLeft = Direction.LEFT;
            while (robot.getDirection() != directionLeft) {
                robot.turnLeft();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            Direction directionRight = Direction.RIGHT;
            while (robot.getDirection() != directionRight) {
                robot.turnRight();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {
            Direction directionDown = Direction.DOWN;
            while (robot.getDirection() != directionDown) {
                robot.turnLeft();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        } else if (toY > robot.getY()) {
            Direction directionUp = Direction.UP;
            while (robot.getDirection() != directionUp) {
                robot.turnRight();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        System.out.println("X = " + robot.getX() + " Y = " + robot.getY());
    }
}
