package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
      robot.initialDirection();
      int xSteps = toX - robot.getX();
      int ySteps = toY - robot.getY();
      if (toX < 0) {
        robot.turnLeft();
      }
      if (toX > 0) {
        robot.turnRight();
      }
      if (xSteps < 0) xSteps *= -1;
      for (int i = 0; i < xSteps; i++) robot.stepForward();
      if (toY > 0 && ySteps < 0 && toX > 0 || toY > 0 && ySteps > 0 && toX < 0 ||
        toY < 0 && ySteps > 0 && toX < 0 || toY < 0 && ySteps < 0 && toX > 0) {
        robot.turnRight();
      }
      if (toY > 0 && ySteps > 0 && toX > 0 || toY > 0 && ySteps < 0 && toX < 0 ||
        toY < 0 && ySteps < 0 && toX < 0 || toY < 0 && ySteps > 0 && toX > 0) {
        robot.turnLeft();
      }
      if (ySteps < 0) ySteps *= -1;
      for (int i = 0; i < ySteps; i++) robot.stepForward();
    }
}
