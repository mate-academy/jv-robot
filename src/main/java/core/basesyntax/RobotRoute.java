package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        robot.setCoordinateX(toX);
        robot.setCoordinateY(toY);

        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX) {
            if (currentX < toX) {
                robot.turnRight();
                currentX++;
            } else {
                robot.turnLeft();
                currentX--;
            }
            robot.stepForward();
        }

        while (currentY != toY) {
            if (currentY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentY++;
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward();
                currentY--;
            }
        }
    }
}
