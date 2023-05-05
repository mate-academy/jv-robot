package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int locationX = robot.getX();
        int locationY = robot.getY();

        int stepX = toX - locationX;
        int stepY = toY - locationY;

        if (stepX != 0) {
            if (stepX < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            if (stepX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            if (stepX < 0) {
                stepX *= -1;
            }
            for (int i = 0; i < stepX; i++) {
                robot.stepForward();
            }
        }

        if (stepY != 0) {
            if (stepY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
            }
            if (stepY < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            if (stepY < 0) {
                stepY *= -1;
            }
            for (int i = 0; i < stepY; i++) {
                robot.stepForward();
            }
        }
    }
}
