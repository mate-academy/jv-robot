package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        int deltaX = toX - currentX;

        if (deltaX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < deltaX; i++) {
                robot.stepForward();
            }
        } else if (deltaX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0; i > deltaX; i--) {
                robot.stepForward();
            }
        }

        while (currentY != toY) {
            if (currentY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (currentY > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
            currentY = robot.getY();
        }
    }
}

