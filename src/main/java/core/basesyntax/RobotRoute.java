package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if(robot.getY()!=toX) {
            if (robot.getX() > toX) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnRight();
                }
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            if (robot.getX() < toX) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if(robot.getY()!=toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnLeft();
                }
                while(robot.getDirection()!=Direction.DOWN){
                    robot.turnRight();
                }
            }
            if (robot.getY() < toY) {
                if (robot.getDirection() == Direction.LEFT) {
                    robot.turnRight();
                }
                while(robot.getDirection()!=Direction.UP){
                    robot.turnLeft();
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
