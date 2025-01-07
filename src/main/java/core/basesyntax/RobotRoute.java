package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        // Navigation along axis X
        if (robot.getX() < toX) {
            // Turn to right
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            // Move to the right
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            // Turn to the left
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            // Move to the left
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        // Navigation along axis Y
        if (robot.getY() < toY) {
            // Turn upwords
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            // Move upwords
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            // Turn down
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            // Move down
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }

    }
}
