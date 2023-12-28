package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }
        switchHorizontalDirection(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        switchVerticalDirection(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void switchHorizontalDirection(Robot robot, int toX) {
        if (robot.getX() > toX && robot.getDirection() != Direction.LEFT) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        if (robot.getX() < toX && robot.getDirection() != Direction.RIGHT) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void switchVerticalDirection(Robot robot, int toY) {
        if (robot.getY() > toY && robot.getDirection() != Direction.DOWN) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        if (robot.getY() < toY && robot.getDirection() != Direction.UP) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
    }
}
