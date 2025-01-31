package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //PORUSZANIE SIE PO OSI X
        if (robot.getX() < toX) {
           robot.turnRight();
           while (robot.getDirection() == Direction.RIGHT) robot.stepForward();
        }
        if (robot.getX() > toX){
            robot.turnLeft();
            while (robot.getDirection() == Direction.LEFT) robot.stepForward();
        }
        if (robot.getY() < toY) {
            robot.turnRight();
            while (robot.getDirection() == Direction.UP) robot.stepForward();
        }
        if (robot.getY() > toY) {
            robot.turnRight();
            while (robot.getDirection() == Direction.DOWN) robot.stepForward();
        }
        if (robot.getY() == toY && robot.getX() == toX) {
            System.out.println("You are in right place");
        }
    }
}