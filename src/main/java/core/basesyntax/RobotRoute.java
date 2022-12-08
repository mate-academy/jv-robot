package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnLeft();
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                robot.turnLeft();
            } else {
                    robot.turnRight();
            }
        } else {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (robot.getY() < toY) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
            }
    }
}
