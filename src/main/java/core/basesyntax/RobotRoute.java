package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        Direction xdirection = (robot.getX() - toX > 0) ? Direction.LEFT : Direction.RIGHT;
        Direction ydirection = (robot.getY() - toY > 0) ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != xdirection) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != ydirection) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}
