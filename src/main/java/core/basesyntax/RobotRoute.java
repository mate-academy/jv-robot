package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP){
                robot.turnRight();
            }
            for (int i = robot.getY(); i < toY ; i++) {
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN){
                robot.turnRight();
            }
            for (int i = robot.getY(); i > toY ; i--) {
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnRight();
            }
            for (int i = robot.getX(); i < toX ; i++) {
                robot.stepForward();
            }
        }
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT){
                robot.turnRight();
            }
            for (int i = robot.getX(); i > toX ; i--) {
                robot.stepForward();
            }
        }
    }
}
