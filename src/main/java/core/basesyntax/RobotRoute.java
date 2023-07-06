package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getY() > toY && robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else if (robot.getY() < toY && robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (robot.getY() < toY && robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else if (robot.getY() > toY && robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (robot.getY() > toY && robot.getX() == toX) {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (robot.getY() < toY && robot.getX() == toX) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (robot.getX() > toX && robot.getY() == toY) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else if (robot.getX() < toX && robot.getY() == toY) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }
    }
}
