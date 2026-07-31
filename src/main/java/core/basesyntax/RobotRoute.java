package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int distanceX = robot.getX() - toX;
        int distanceY = robot.getY() - toY;

        if (distanceX != 0) {
            Direction directionX = distanceX > 0 ? Direction.LEFT : Direction.RIGHT;

            while (directionX != robot.getDirection()) {
                robot.turnLeft();
            }

            for (int i = 1; i <= Math.abs(distanceX); i++) {
                robot.stepForward();
            }
        }

        if (distanceY != 0) {
            Direction directionY = distanceY > 0 ? Direction.DOWN : Direction.UP;

            while (directionY != robot.getDirection()) {
                robot.turnRight();
            }

            for (int i = 1; i <= Math.abs(distanceY); i++) {
                robot.stepForward();
            }
        }
    }
}
