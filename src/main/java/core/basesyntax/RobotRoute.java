package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      int lengthToX = toX - robot.getX();
      int lengthToY = toY - robot.getY();

      int x = robot.getX();
      int y = robot.getY();
      if(robot.getX() != toX && robot.getX() < toX) {
          switch (robot.getDirection()){
              case UP:
                  robot.turnRight();
                  break;
              case LEFT:
                  robot.turnLeft();
                  robot.turnLeft();
                  break;
              case DOWN:
                  robot.turnLeft();
                  break;
              default:
                  break;
          }
          for (int i = 0; i < Math.abs(lengthToX); i++) {
              robot.stepForward();
          }
      } else
        if(robot.getX() != toX && robot.getX() > toX) {
            switch (robot.getDirection()){
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
                    break;
            }
            for (int i = 0; i < Math.abs(lengthToX); i++) {
                robot.stepForward();
            }
        }
        if(robot.getY() != toY && robot.getY() < toY) {
            switch (robot.getDirection()){
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < Math.abs(lengthToY); i++) {
                robot.stepForward();
            }
        } else
        if(robot.getY() != toY && robot.getY() > toY) {
            switch (robot.getDirection()){
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < Math.abs(lengthToY); i++) {
                robot.stepForward();
            }
        }




    }
}
