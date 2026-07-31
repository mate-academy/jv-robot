package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        gorizontalMove(robot, toX);
        verticalMove(robot, toY);
    }

    private void verticalMove(Robot robot, int toY) {
        if ((robot.getY() - toY) > 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() - toY > 0) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() - toY < 0) {
                robot.stepForward();
            }
        }
    }

    private void gorizontalMove(Robot robot, int toX) {
        if ((robot.getX() - toX) > 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() - toX > 0) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (robot.getX() - toX < 0) {
                robot.stepForward();
            }
        }
    }
}
