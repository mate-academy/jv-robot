package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX() || toY != robot.getY()) {
            if (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (toX < robot.getX()) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            if (toY > robot.getY()) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (toY < robot.getY()) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}
