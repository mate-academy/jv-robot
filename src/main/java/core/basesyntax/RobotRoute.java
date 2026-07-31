package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        while (x != toX || y != toY) {
            if (toX < x) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                while (x != toX) {
                    robot.stepForward();
                    x--;
                }
            }
            if (toX > x) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                while (x != toX) {
                    robot.stepForward();
                    x++;
                }
            }
            if (toY < y) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                while (y != toY) {
                    robot.stepForward();
                    y--;
                }
            }
            if (toY > y) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (y != toY) {
                    robot.stepForward();
                    y++;
                }
            }
        }
    }
}
