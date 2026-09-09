package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        X = robot.getX();
        Y = robot.getY();
        Direction = robot.getDirection();
        if (X > toX){
          while(Direction != LEFT){
              robot.turnLeft();
              Direction = robot.getDirection();
          }
          while (toX != X) {
            robot.stepForward();
            X = robot.getX();
          }
        }else if (X < toX){
          while(Direction != RIGHT){
              robot.turnRight();
              Direction = robot.getDirection();
          }
          while (toX != X) {
            robot.stepForward();
            X = robot.getX();
          }
        }
        if (Y > toY){
          while(Direction != DOWN){
              robot.turnLeft();
              Direction = robot.getDirection();
          }
          while (toY != Y) {
            robot.stepForward();
            Y = robot.getY();
          }
        }else if (Y < toY){
          while(Direction != RIGHT){
              robot.turnRight();
              Direction = robot.getDirection();
          }
          while (toY != Y) {
            robot.stepForward();
            X = robot.getY();
          }
        }
    }
}
