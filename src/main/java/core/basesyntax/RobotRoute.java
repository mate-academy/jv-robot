package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      if (robot.getX() > toX) {
          switch (robot.getDirection()) {
              case UP:
                  robot.turnLeft();
                  break;
              case RIGHT:
                  robot.turnLeft();
                  robot.turnLeft();
                  break;
              case DOWN:
                  robot.turnRight();
                  break;
              default:
          }
      } else {
          switch (robot.getDirection()) {
              case UP:
                  robot.turnRight();
                  break;
              case LEFT:
                  robot.turnRight();
                  robot.turnRight();
                  break;
              case DOWN:
                  robot.turnLeft();
                  break;
              default:
          }
      }
      while (robot.getX() != toX) {
          robot.stepForward();
      }
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                default:
            }
        } else {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                default:
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
