package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();
        if (toX < 0) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
        if (currentX > toX) {
            for (int x = currentX; x > toX; x--) {
                robot.stepForward();
            }
        }  else {
            for (int x = currentX; x < toX; x++) {
                robot.stepForward();
            }
        }

        if (toY<currentY) {
            robot.turnLeft();
        } else {
            robot.turnRight();
        }
        if (currentY > toY) {
            for (int y = currentY; y > toY; y--) {
                robot.stepForward();
            }
        }  else {
            for (int y = currentY; y < toY; y++) {
                robot.stepForward();
            }
        }
    }
}
