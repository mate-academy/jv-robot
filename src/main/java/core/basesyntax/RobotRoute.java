package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
                robot.stepForward();
            }
        } else {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(robot.getX() - toX); i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            if (robot.getX() < toX) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
                robot.stepForward();
            }
        } else {
            if (robot.getX() < toX) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(robot.getY() - toY); i++) {
                robot.stepForward();
            }
        }
    }
}

