package core.basesyntax;

public class RobotRoute {
  public void moveRobot(Robot robot, int toX, int toY) {
    if (robot.getX() == toX && robot.getY() == toY) {
      return;
    }

    int dX = robot.getX() - toX;
    int dY = robot.getY() - toY;

    Direction dirX = null;
    Direction dirY = null;

    if (dX != 0) {
      dirX = dX > 0 ? Direction.LEFT : Direction.RIGHT;
    }

    if (dY != 0) {
      dirY = dY > 0 ? Direction.UP : Direction.DOWN;
    }

    if (dirX != null) {
      while (robot.getDirection() != dirX) {
        robot.turnLeft();
      }

      while (robot.getX() != toX) {
        robot.stepForward();
      }
    }

    if (dirY != null) {
      while (robot.getDirection() != dirY) {
        robot.turnLeft();
      }

      while (robot.getY() != toY) {
        robot.stepForward();
      }
    }
  }
}
