package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        var currentX = robot.getX();
        var currentY = robot.getY();

        if (currentX == toX) {
            changeDirectionVertical(robot, toX, toY);
            for (int i = 0; i < Math.abs(currentY - toY); i++) {
                robot.stepForward();
            }

        } else if (currentY == toY) {
            changeDirectionHorizontal(robot, toX, toY);
            for (int i = 0; i < Math.abs(currentX - toX); i++) {
                robot.stepForward();
            }

        } else {
            changeDirectionHorizontal(robot, toX, toY);
            for (int i = 0; i < Math.abs(currentX - toX); i++) {
                robot.stepForward();
            }

            changeDirectionVertical(robot, toX, toY);
            for (int i = 0; i < Math.abs(currentY - toY); i++) {
                robot.stepForward();
            }
        }

    }

    private void changeDirectionHorizontal(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void changeDirectionVertical(Robot robot, int toX, int toY) {
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
    }
}
