package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int stepRobotsX = robot.getX() - toX;
        int stepRobotsY = robot.getY() - toY;
        if (stepRobotsX > 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0; i < stepRobotsX; i++) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i > stepRobotsX; i--) {
                robot.stepForward();
            }
        }
        if (stepRobotsY > 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = 0; i < stepRobotsY; i++) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = 0; i > stepRobotsY; i--) {
                robot.stepForward();
            }
        }
    }
}
