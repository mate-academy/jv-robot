package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (toX - robot.getX >= 0) {
            while (robot.getDirection() != RIGHT) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != LEFT) {
                robot.turnLeft();
            }
        }
        while (toX != robot.getX) {
            robot.stepForward();
        }
        if (toY - robot.getY >= 0) {
            while (robot.getDirection() != UP) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != DOWN) {
                robot.turnLeft();
            }
        }
        while (toY != robot.getY) {
            robot.stepForward();
        }
    }
}
