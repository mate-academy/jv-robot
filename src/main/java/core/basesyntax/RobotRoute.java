package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        //Direction direction = robot.getDirection();
        //int robot.getX() = robot.getX();
        //int robot.getY() = robot.getY();

        if (robot.getX() == toX && robot.getY() == toY) {return;}
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

        }
    }
}
