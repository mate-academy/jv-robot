package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int horizontal = robot.getX();
        int vertical = robot.getY();
        horizontalMovement(horizontal, toX, robot);
        verticalMovement(vertical, toY, robot);
    }

    private void horizontalMovement(int horizontal, int toX, Robot robot) {
        int moveHorisontally = 0;
        if (toX > horizontal) {
            moveHorisontally = toX - horizontal;
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            moveHorisontally = horizontal - toX;
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < moveHorisontally; i++) {
            robot.stepForward();
        }
    }

    private void verticalMovement(int vertical, int toY, Robot robot) {
        int moveVertically = 0;
        if (toY > vertical) {
            moveVertically = toY - vertical;
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        } else {
            moveVertically = vertical - toY;
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < moveVertically; i++) {
            robot.stepForward();
        }
    }
}
