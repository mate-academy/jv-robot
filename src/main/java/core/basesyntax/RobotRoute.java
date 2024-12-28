package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      int distanceX = toX - robot.getX();
      int distanceY = toY - robot.getY();

      switch (robot.getDirection()) {
          case UP:
              robot.turnRight();
              break;
          case DOWN:
              robot.turnLeft();
              break;
          case LEFT:
              robot.turnRight();
              robot.turnRight();
              break;
          case RIGHT:
              break;
      }

      if (distanceX < 0) {
          robot.turnRight();
          robot.turnRight();
      }

      while (robot.getX() != toX) {
          robot.stepForward();
      }

      switch (robot.getDirection()) {
          case UP:
              break;
          case DOWN:
              robot.turnLeft();
              robot.turnLeft();
              break;
          case LEFT:
              robot.turnRight();
              break;
          case RIGHT:
              robot.turnLeft();
              break;
      }

      if (distanceY < 0) {
          robot.turnLeft();
          robot.turnLeft();
      }

      while (robot.getY() != toY) {
          robot.stepForward();
      }
    }
}
