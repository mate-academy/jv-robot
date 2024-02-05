package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        prepareToGoTowardsX(robot, toX);
        for (int i = 0; i < Math.abs(currentX - toX); ++i) {
            robot.stepForward();
        }
        int currentY = robot.getY();
        prepareToGoTowardsY(robot, toY);
        for (int i = 0; i < Math.abs(currentY - toY); ++i) {
            robot.stepForward();
        }
    }

    private void prepareToGoTowardsX(Robot robot, int toX) {
        if (robot.getX() == toX) {
            return;
        }

        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void prepareToGoTowardsY(Robot robot, int toY) {
        if (robot.getY() == toY) {
            return;
        }

        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
    }
}
