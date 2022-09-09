package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }

        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        //x_home = x_robot

        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
        //y_home = y_robot

    }
}

