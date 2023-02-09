package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (Math.abs(toX - robot.getX()) > Math.abs(robot.getX())) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (Math.abs(toY - robot.getY()) > Math.abs(robot.getY())) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
