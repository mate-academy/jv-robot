package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        //write your solution here
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        while (deltaX > 0 && robot.getDirection() != Direction.RIGHT) {
            robot.turnLeft();
        }

        while (deltaX < 0 && robot.getDirection() != Direction.LEFT) {
            robot.turnRight();
        }

        while (deltaX != 0) {
            robot.stepForward();
            deltaX = toX - robot.getX();
        }

        while (deltaY > 0 && robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }

        while (deltaY < 0 && robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }

        while (deltaY != 0) {
            robot.stepForward();
            deltaY = toY - robot.getY();
        }
    }
}
