package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        while (robot.getX() != toX || robot.getY() != toY) {
            int dx = toX - robot.getX();
            int dy = toY - robot.getY();

            while (dx > 0 && robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }

            while (dx < 0 && robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }

            while (dy > 0 && robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }

            while (dy < 0 && robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }

            robot.stepForward();
        }
    }
}
