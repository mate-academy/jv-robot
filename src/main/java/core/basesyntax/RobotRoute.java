package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int horizontalAxis = robot.getX();
        int verticalAxis = robot.getY();
        horizontalMovement(horizontalAxis, toX, robot);
        verticalMovement(verticalAxis, toY, robot);
    }

    private void horizontalMovement(int horizontalAxis, int toX, Robot robot) {
        int moveHorizontally = 0;
        if (toX > horizontalAxis) {
            moveHorizontally = toX - horizontalAxis;
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else {
            moveHorizontally = horizontalAxis - toX;
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < moveHorizontally; i++) {
            robot.stepForward();
        }
    }

    private void verticalMovement(int verticalAxis, int toY, Robot robot) {
        int moveVertically = 0;
        if (toY > verticalAxis) {
            moveVertically = toY - verticalAxis;
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else {
            moveVertically = verticalAxis - toY;
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        for (int i = 0; i < moveVertically; i++) {
            robot.stepForward();
        }
    }
}
