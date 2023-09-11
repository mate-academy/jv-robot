package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (robot.getX() != toX || robot.getY() != toY) {
            int currentX = robot.getX();
            int currentY = robot.getY();

            if (currentX < toX) {
                robot.turnRight();
                robot.stepForward();
            } else if (currentX > toX) {
                robot.turnLeft();
                robot.stepForward();
            } else if (currentY < toY) {
                robot.stepForward();
            } else if (currentY > toY) {
                robot.turnLeft();
                robot.turnLeft();
                robot.stepForward();
            }
        }
    }
}
