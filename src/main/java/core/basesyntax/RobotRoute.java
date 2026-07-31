package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        moveRobotX(robot, toX);
        moveRobotY(robot, toY);
    }

    public void moveRobotX(Robot robot, int toX) {
        if (robot.getX() >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (robot.getX() <= toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void moveRobotY(Robot robot, int toY) {
        if (robot.getY() >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        if (robot.getY() <= toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
