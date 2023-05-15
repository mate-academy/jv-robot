package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        while (x != toX || y != toY) {
            if (x < toX) {
                robot.turnRight();
                robot.stepForward();
                x++;
            } else if (x > toX) {
                robot.turnLeft();
                robot.stepForward();
                x--;
            } else if (y < toY) {
                robot.stepForward();
                y++;
            } else if (y > toY) {
                robot.turnRight();
                robot.turnRight();
                robot.stepForward();
                y--;
            }
        }
    }
}
