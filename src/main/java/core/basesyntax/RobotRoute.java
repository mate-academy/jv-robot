package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX) {
            if (currentX < toX) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
            robot.stepForward();
            currentX = robot.getX();
        }

        while (currentY != toY) {
            if (currentY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
            currentY = robot.getY();
        }
    }
}

