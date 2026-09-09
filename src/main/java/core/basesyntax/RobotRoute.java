package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int X = robot.getX();
        int Y = robot.getY();
        Direction direction = robot.getDirection();
        if(X == toX){}
        else if (X > toX){
          while(direction != LEFT){
              robot.turnLeft();
              direction = robot.getDirection();
          }
          while (toX != X) {
            robot.stepForward();
            X = robot.getX();
          }
        }else if (X < toX){
          while(direction != RIGHT){
              robot.turnRight();
              direction = robot.getDirection();
          }
          while (toX != X) {
            robot.stepForward();
            X = robot.getX();
          }
        }
        if(Y==toY){}
        else if (Y > toY){
          while(direction != DOWN){
              robot.turnLeft();
              direction = robot.getDirection();
          }
          while (toY != Y) {
            robot.stepForward();
            Y = robot.getY();
          }
        }else if (Y < toY){
          while(direction != UP){
              robot.turnRight();
              direction = robot.getDirection();
          }
          while (toY != Y) {
            robot.stepForward();
            Y = robot.getY();
          }
        }
    }
}
