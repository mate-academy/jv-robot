package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        findValidDirectionX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        findValidDirectionY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void findValidDirectionX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
    }

    private void findValidDirectionY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
    }
}
