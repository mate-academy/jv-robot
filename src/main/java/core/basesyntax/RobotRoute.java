package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionTowardsX = (toX - robot.getX() > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction directionTowardsY = (toY - robot.getY() > 0) ? Direction.UP : Direction.DOWN;
        while (robot.getX() != toX) {
            if (robot.getDirection() == directionTowardsX) {
                robot.stepForward();
            } else {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            if (robot.getDirection() == directionTowardsY) {
                robot.stepForward();
            } else {
                robot.turnRight();
            }
        }
        //write your solution here
    }
}
