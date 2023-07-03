package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX != robot.getX()) {
            if (toX < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            if (toX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            while (robot.getX() < toX || robot.getX() > toX) {
                robot.stepForward();
            }
        }
        if (toY != robot.getY()) {
            if (toY < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }

            if (toY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            }
            while (robot.getY() < toY || robot.getY() > toY) {
                robot.stepForward();

            }
        }

    }
}


