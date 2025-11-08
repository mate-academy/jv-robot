package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int tox, int toy) {

        while (robot.getX() != tox) {
            if (robot.getX() < tox) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }

        while (robot.getY() != toy) {
            if (robot.getY() < toy) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }
}
