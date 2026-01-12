package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getY() != toY || robot.getX() != toX) {
            while (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() < toY && robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX && robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}

