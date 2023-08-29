package core.basesyntax;

public class RobotRoute {
    protected void moveRobot(Robot robot, int toX, int toY) {
      int deltaX = toX - robot.getX();
      int deltaY = toY - robot.getY();

      if (deltaX > 0) {
          for (int i = 0; i < deltaX; i++) {
              robot.turnRight();
          }
      } else if (deltaX < 0) {
          for (int i = 0; i > deltaX; i--) {
              robot.turnLeft();
          }
      }

          for (int i = 0; i < Math.abs(deltaX); i++) {
              robot.stepForward();
          }

      if (deltaY > 0) {
          for(int i = 0; i < deltaY; i++) {
              robot.turnRight();
          }
      } else if (deltaY < 0) {
          for(int i = 0; i > deltaY; i--) {
              robot.turnLeft();
          }
      }

          for (int i = 0; i < Math.abs(deltaY); i++) {
              robot.stepForward();
          }
    }
}
