package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getY() != toY || robot.getX() != toX) {
            int currentX = robot.getX();
            int currentY = robot.getY();

            if (currentX < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (currentX > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
            if (currentY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (currentY > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }
    }
}
