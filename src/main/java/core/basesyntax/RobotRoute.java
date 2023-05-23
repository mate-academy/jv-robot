package core.basesyntax;

public class RobotRoute {
  public void moveRobot(Robot robot, int toX, int toY) {
    calcOverCoord(robot,toX,true);//true if x
    calcOverCoord(robot,toY,false);//false if y
  }

  private void calcOverCoord(Robot robot, int param, boolean xy) {
    if (xy) {
      if (checkXyBiggerThanParam(robot.getX(),param)) {
        lookSide(robot, Direction.LEFT);
      }
      else {
        lookSide(robot, Direction.RIGHT);
      }
      finish(robot, param, xy);
    }
    else {
      if (checkXyBiggerThanParam(robot.getY(),param)) {
        lookSide(robot, Direction.DOWN);
      }
      else {
        lookSide(robot, Direction.UP);
      }
      finish(robot, param, xy);
    }
  }

  private void lookSide(Robot robot, Direction direction) {
    while (robot.getDirection() != direction) {
      robot.turnLeft();
    }
  }

  private boolean checkXyBiggerThanParam(int param1, int param2) {
    if (param1 > param2) {
      return true;
    }
    return false;
  }

  //Until it reaches a point
  private void finish(Robot robot,int finishPoint, boolean xOrY) {
    if(xOrY) {
      while(robot.getX() != finishPoint) {
        robot.stepForward();
      }
    }
    else {
      while (robot.getY() != finishPoint) {
        robot.stepForward();
      }
    }
  }
}
