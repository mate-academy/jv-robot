package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int lengthOfRouteX = toX - robot.getX();
        int lengthOfRouteY = toY - robot.getY();
        while (toX != robot.getX()) {
            if (lengthOfRouteX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnLeft();
                }
                while (toX == robot.getX()) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                while (toX == robot.getX()) {
                    robot.stepForward();
                }
            }
        }
        while (toY != robot.getY()) {
            if (lengthOfRouteY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
                while (toY == robot.getY()) {
                    robot.stepForward();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (toY == robot.getY()) {
                    robot.stepForward();
                }
            }
        }
    }
}
