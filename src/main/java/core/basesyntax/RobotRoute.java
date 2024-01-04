package core.basesyntax;

public class RobotRoute {
    private void moveHorizontally(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        while (currentX != toX) {
            if (currentX < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentX++;
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
                currentX--;
            }
        }

        while (currentY != toY) {
            if (currentY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentY++;
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
                currentY--;
            }
        }
    }
}
