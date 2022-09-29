package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      Direction nededDirX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
      Direction nededDirY = robot.getY() > toY ? Direction.DOWN : Direction.UP;

      while (robot.getDirection() != nededDirX) {
          robot.turnRight();
      }
      while (robot.getX() != toX) {
          robot.stepForward();
      }
      while (robot.getDirection() != nededDirY) {
          robot.turnRight();
      }
      while (robot.getY() != toY) {
          robot.stepForward();
      }
    }
}
