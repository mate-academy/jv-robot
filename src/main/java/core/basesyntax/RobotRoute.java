package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            int distanceX = toX - robot.getX();
            int distanceY = toY - robot.getY();

            if (distanceX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (distanceX < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }

            if (distanceY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (distanceY < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }
}
