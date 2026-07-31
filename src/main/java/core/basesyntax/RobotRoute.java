package core.basesyntax;

public class RobotRoute {
  public void moveRobot(Robot robot, int toX, int toY) {
    final int initialX = robot.getX();
    final int initialY = robot.getY();

    // Moving on the X axis
    if (robot.getX() < toX) {
      switch (robot.getDirection()) {
        case UP:
          robot.turnRight();
          break;
        case DOWN:
          robot.turnLeft();
          break;
        case LEFT:
          for (int i = 0; i < 2; i++) {
            robot.turnRight();
          }
          break;
        case RIGHT:
          break;          
      }
      
      for (int i = 0; i < toX - initialX; i++) {
        robot.stepForward();
      }
    } else if (robot.getX() > toX) {
      switch (robot.getDirection()) {
        case UP:
          robot.turnLeft();
          break;
        case DOWN:
          robot.turnRight();;
          break;
        case RIGHT:
          for (int i = 0; i < 2; i++) {
            robot.turnLeft();
          }
          break;
        case LEFT:
          break;          
      }
      
      for (int i = 0; i < initialX - toX; i++) {
        robot.stepForward();
      }
    }

    // Moving on the Y axis
    if (robot.getY() < toY) {
      switch (robot.getDirection()) {
        case LEFT:
          robot.turnRight();
          break;
        case RIGHT:
          robot.turnLeft();
          break;
        case DOWN:
          for (int i = 0; i < 2; i++) {
            robot.turnRight();
          }
          break;
        case UP:
          break;          
      }
      
      for (int i = 0; i < toY - initialY; i++) {
        robot.stepForward();
      }
    } else if (robot.getY() > toY) {
      switch (robot.getDirection()) {
        case RIGHT:
          robot.turnRight();
          break;
        case LEFT:
          robot.turnLeft();;
          break;
        case UP:
          for (int i = 0; i < 2; i++) {
            robot.turnLeft();
          }
          break;
        case DOWN:
          break;          
      }
      
      for (int i = 0; i < initialY - toY; i++) {
        robot.stepForward();
      }
    }
  }
}
