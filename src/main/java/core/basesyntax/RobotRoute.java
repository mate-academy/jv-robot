package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = (robot.getY() < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getDirection() != directionX){
            robot.turnLeft();
        }
        while (robot.getX() != toX){
            robot.stepForward();
        }
        while (robot.getDirection() != directionY){
            robot.turnLeft();
        }
        while (robot.getY() != toY){
            robot.stepForward();
        }
    }
}
