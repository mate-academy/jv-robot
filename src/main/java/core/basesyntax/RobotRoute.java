package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getY() == toY && robot.getX() == toX) {
            return;
        }
        //solving the y position
        int ycurrent = robot.getDirection().ordinal(); // UP=0, DOWN=1, LEFT=2, RIGHT=3
        int yneeded = (toY > robot.getY() ? 0 : 1);

        while (yneeded != ycurrent) {
            robot.turnRight();
            ycurrent = robot.getDirection().ordinal();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }

        //solving the x position
        int xcurrent = robot.getDirection().ordinal();
        int xneeded = (toX > robot.getX() ? 3 : 2);

        while (xneeded != xcurrent) {
            robot.turnLeft();
            xcurrent = robot.getDirection().ordinal();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }
}
