package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        robot.defineDirectionX(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        robot.defineDirectionY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
