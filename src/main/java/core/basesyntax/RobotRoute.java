package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      if (robot.getY() != toY && robot.getY() < toY) {
          while (robot.getDirection() != Direction.UP) {
              robot.turnLeft();
          }
      }
      else if (robot.getY() != toY && robot.getY() > toY) {
          while (robot.getDirection() != Direction.DOWN) {
              robot.turnRight();
          }
      }
      while (toY != robot.getY()) {
          robot.stepForward();
      }
      if (robot.getX() != toX && robot.getX() < toX) {
          while (robot.getDirection() != Direction.LEFT) {
              robot.turnLeft();
          }
      }
      else if (robot.getX() != toX && robot.getX() > toX) {
          while (robot.getDirection() != Direction.RIGHT) {
              robot.turnRight();
          }
      }
      while (toX != robot.getX()) {
          robot.stepForward();
      }
    }
}
