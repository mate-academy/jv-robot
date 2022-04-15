package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //for coordinates x
        while (robot.getX() != toX) {
          if (robot.getX() > toX) {
              while (robot.getDirection() != Direction.LEFT) {
                  robot.turnLeft();
              }
          }else {
              while (robot.getDirection() != Direction.RIGHT) {
                  robot.turnRight();
              }
          }
        robot.stepForward();
        }

        //for coordinates y

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }

            }else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}
