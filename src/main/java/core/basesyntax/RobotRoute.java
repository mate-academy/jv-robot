package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX) {
                while (robot.getX() < toX && robot.getDirection() != Direction.RIGHT
                    || robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
                robot.stepForward();
                continue;
            }
            if (robot.getY() != toY) {
                while (robot.getY() < toY && robot.getDirection() != Direction.UP
                    || robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }
}
