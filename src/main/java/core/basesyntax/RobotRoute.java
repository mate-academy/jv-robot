package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (toX == robot.getX() && toY == robot.getY()) {}
        else {
            Direction neededDirX;
            neededDirX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;

            while (neededDirX != robot.getDirection()) {
                robot.turnLeft();
            }

            while (robot.getX() != toX) {
                robot.stepForward();
            }

            Direction neededDirY;
            neededDirY = robot.getY() > toY ? Direction.DOWN : Direction.UP;

            while (neededDirY != robot.getDirection()) {
                robot.turnLeft();
            }

            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
