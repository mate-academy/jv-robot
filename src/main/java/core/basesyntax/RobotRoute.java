package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        // turn left or right until facing the right direction
        while (deltaX != 0) {
            if (deltaX > 0) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                else {
                    robot.stepForward();
                    deltaX--;
                }
            }
            else {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                else {
                    robot.stepForward();
                    deltaX++;
                }
            }
        }

        while (deltaY != 0) {
            if (deltaY > 0) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                    robot.turnRight();
                }
                else {
                    robot.stepForward();
                    deltaY--;
                }
            }
            else {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                    robot.turnRight();
                }
                else {
                    robot.stepForward();
                    deltaY++;
                }
            }
        }
    }
}
