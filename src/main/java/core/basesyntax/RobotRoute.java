package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int horizontalSteps = (toX > 0 & robot.getX() > 0) || (toX < 0 & robot.getX() < 0)
                ? Math.abs(toX - robot.getX()) : Math.abs(toX) + Math.abs(robot.getX());
        int verticalSteps = (toY > 0 & robot.getY() > 0) || (toY < 0 & robot.getY() < 0)
                ? Math.abs(toY - robot.getY()) : Math.abs(toY) + Math.abs(robot.getY());
        if (horizontalSteps != 0) {
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            for (int i = horizontalSteps; i > 0; i--) {
                robot.stepForward();
            }
        }
        if (verticalSteps != 0) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            for (int i = verticalSteps; i > 0; i--) {
                robot.stepForward();
            }
        }
    }
}
