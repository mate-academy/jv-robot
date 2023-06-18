package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        while (currentX != toX || currentY != toY) {
            if (currentX < toX) {
                robot.turnRight();
                robot.stepForward();
                currentX++;
            } else if (currentX > toX) {
                robot.turnLeft();
                robot.stepForward();
                currentX--;
            }
            if (currentY < toY) {
                robot.stepForward();
                currentY++;
            } else if (currentY > toY) {
                robot.turnRight();
                robot.turnRight();
                robot.stepForward();
                currentY--;
            }
        }
    }
}
