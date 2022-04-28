package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        //find right rotation for X move
        while((robot.getX() < toX ? Direction.RIGHT : Direction.LEFT) != robot.getDirection()){
            robot.turnLeft();
        }
        //going by X
        while (robot.getX() != toX){
            robot.stepForward();
        }
        //find right rotation for Y move
        while((robot.getY() < toY ? Direction.UP : Direction.DOWN) != robot.getDirection()){
            robot.turnLeft();
        }
        //going by Y
        while (robot.getY() != toY){
            robot.stepForward();
        }
    }
}
