package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction desiredDirection;
        if(robot.getX() > toX) {
            desiredDirection = Direction.LEFT;
        } else {
            desiredDirection = Direction.RIGHT;
        }
        while(!(robot.getDirection().equals(desiredDirection))) {
            robot.turnLeft();
        }
        while(robot.getX() != toX) {//write your solution here
            robot.stepForward();
        }
        if(robot.getY() > toY) {
            desiredDirection = Direction.DOWN;
        } else {
            desiredDirection = Direction.UP;
        }
        while(!(robot.getDirection().equals(desiredDirection))) {
            robot.turnLeft();
        }
        while(robot.getY() != toY) {//write your solution here
            robot.stepForward();
        }
    }
}
