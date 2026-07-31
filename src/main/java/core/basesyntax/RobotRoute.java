package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX || currentY != toY) {
            int deltaX = toX - currentX;
            int deltaY = toY - currentY;

            if (deltaX > 0) {
                if (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (deltaX < 0) {
                if (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }

            if (deltaY > 0) {
                if (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (deltaY < 0) {
                if (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }

            robot.stepForward();

            currentX = robot.getX();
            currentY = robot.getY();
        }
    }
}
