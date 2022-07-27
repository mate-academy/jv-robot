package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        Robot amigo = new Robot(robot.getDirection(), robot.getX(), robot.getY());

        if (amigo.getX() > toX) {
            amigo.turnLeft();
        }   amigo.turnRight();

        int xDistance = amigo.getX() - toX;
        while (xDistance > 0) {
            amigo.stepForward();
        }

        if (amigo.getY() > toY) {
            amigo.turnLeft();
        }   amigo.turnRight();

        int yDistance = amigo.getY() - toY;
        while (yDistance > 0) {
            amigo.stepForward();
        }
    }
}
