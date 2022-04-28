package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while((robot.getX() < toX ? Direction.RIGHT : Direction.LEFT) != robot.getDirection()){
            robot.turnLeft();
        }
        while (robot.getX() != toX){
            robot.stepForward();
        }
        while((robot.getY() < toY ? Direction.UP : Direction.DOWN) != robot.getDirection()){
            robot.turnLeft();
        }
        while (robot.getY() != toY){
            robot.stepForward();
        }
    }
}
