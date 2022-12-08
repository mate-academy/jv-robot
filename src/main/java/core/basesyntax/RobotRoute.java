package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (toX > robot.getX()) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    robot.stepForward();
                }
                }
            if (toX < robot.getX()) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                } else {
                    robot.stepForward();
                }
              }
            }
        while (robot.getY() != toY) {
            if (toY < robot.getY()) {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                } else {
                    robot.stepForward();
                }
            }
            if (toY > robot.getY()) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                } else {
                    robot.stepForward();
                }
            }
        }
    }
}
