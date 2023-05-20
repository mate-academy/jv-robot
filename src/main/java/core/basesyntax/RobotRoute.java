package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        if (robot.getX() == toX && robot.getY() == toY) {
            robot.getDirection();
        }

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }if (robot.getX() > toX){
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY ) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
    }   if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}