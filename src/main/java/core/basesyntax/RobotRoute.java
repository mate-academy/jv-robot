package core.basesyntax;

public class RobotRoute {
    private static int directionOfMovement = 0;

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        // next forward on X-axis;
        directionOfMovement = robot.getX() > toX ?  Direction.LEFT.ordinal() : Direction.RIGHT.ordinal();
        while (robot.getDirection().ordinal() != directionOfMovement) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        // next forward on Y-axis;
        directionOfMovement = robot.getY() > toY ?  Direction.DOWN.ordinal() : Direction.UP.ordinal();
        while (robot.getDirection().ordinal() != directionOfMovement) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
