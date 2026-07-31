package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (toX < robot.getX() && robot.getDirection() != Direction.LEFT) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            if (toX > robot.getX() && robot.getDirection() != Direction.RIGHT) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (toY < robot.getY() && robot.getDirection() != Direction.DOWN) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            if (toY > robot.getY() && robot.getDirection() != Direction.UP) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }
}
