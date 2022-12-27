package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here

        Direction xDirection = (robot.getX() - toX > 0) ? Direction.LEFT : Direction.RIGHT;
        Direction yDirection = (robot.getY() - toY > 0) ? Direction.DOWN : Direction.UP;

        while (robot.getDirection() != xDirection) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != yDirection) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }
}
