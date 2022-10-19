package core.basesyntax;

import static java.lang.Math.abs;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int distanceX1 = abs(toX - robot.getX());
        if (distanceX1 != 0) {
            robot.stepForward();
            int distanceX2 = abs(toX - robot.getX());
            if (distanceX1 == distanceX2) {
                robot.turnLeft();
                robot.stepForward();
                distanceX2 = abs(toX - robot.getX());
            }
            if (distanceX1 < distanceX2) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (distanceX1 > distanceX2 && distanceX2 != 0) {
                robot.stepForward();
            }
            for (int i = 0; i < 1000; i++) { //moving X ray
                distanceX2 = abs(toX - robot.getX());
                if (distanceX2 == 0) {
                    break;
                }
                robot.stepForward();
            }
        }
        int distanceY1 = abs(toY - robot.getY());
        if (distanceY1 != 0) {
            robot.turnLeft();
            robot.stepForward();
            int distanceY2 = abs(toY - robot.getY());
            if (distanceY1 == distanceY2) {
                robot.turnLeft();
                robot.turnLeft();
                robot.stepForward();
                robot.turnLeft();
                distanceY2 = toY - robot.getY();
            }
            if (distanceY1 < distanceY2) {
                robot.turnLeft();
                robot.turnLeft();
            }
            if (distanceY1 > distanceY2 && distanceY2 != 0) {
                robot.stepForward();
            }
            for (int i = 0; i < 1000; i++) { //moving X ray
                distanceY2 = abs(toY - robot.getY());
                if (distanceY2 == 0) {
                    break;
                }
                robot.stepForward();
            }
        }
        System.out.println("Robot reached point of destination. X = "
                + robot.getX()
                + " Y = " + robot.getY());
    }
}
