package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() < toX){
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnRight();
                }
            } else if (robot.getX()>toX) {
                while (robot.getDirection() != Direction.LEFT){
                    robot.turnLeft();
                }
            } else if (robot.getY() < toY){
                while (robot.getDirection() != Direction.UP){
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN){
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
    
    public static void main(String[] args) {
        Robot robot = new Robot(0,0,Direction.RIGHT);
        moveRobot(robot, 5,6);
        System.out.println("Robot`s final position: (" + robot.getX() + ", " + robot.getY() + ")");
    }
}
