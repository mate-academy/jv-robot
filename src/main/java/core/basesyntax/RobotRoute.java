package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      while (robot.getX() != toX) {
        switch (robot.getDirection()) {
            case UP: {
                if (robot.getX() < toX) {
                    robot.turnRight();
                }
                else {
                    robot.turnLeft();
                }
                break;
            }
            case DOWN: {
                if (robot.getX() > toX) {
                    robot.turnRight();
                }
                else {
                    robot.turnLeft();
                }
                break;
            }
            case LEFT: {
                if (robot.getX() < toX) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            }
            case RIGHT: {
                if (robot.getX() > toX) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            }
        }
        robot.stepForward();
      }
      while (robot.getY() != toY) {
          switch (robot.getDirection()) {
              case UP: {
                  if (robot.getY() < toY) {
                      robot.turnRight();
                      robot.turnRight();
                  }
                  break;
              }
              case DOWN: {
                  if (robot.getY() > toY) {
                      robot.turnLeft();
                      robot.turnLeft();
                  }
                  break;
              }
              case LEFT: {
                  if (robot.getY() < toY) {
                      robot.turnRight();
                  }
                  else {
                      robot.turnLeft();
                  }
                  break;
              }
              case RIGHT: {
                  if (robot.getY() > toY) {
                      robot.turnRight();
                  }
                  else {
                      robot.turnLeft();
                  }
                  break;
              }
          }
          robot.stepForward();
        }
    }
}
