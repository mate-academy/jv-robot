package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        int y = robot.getY(); //
        if (x > toX) {
            while(direction != Direction.LEFT) {
                robot.turnLeft();
            }
            while(x != toX) {
                robot.stepForward();
            }
        }
        if (x < toX) {
            while(direction != Direction.RIGHT) {
                robot.turnLeft();
            }
            while(x != toX) {
                robot.stepForward();
            }
        }
        if (y > toY) {
            while(direction != Direction.DOWN) {
                robot.turnLeft();
            }
            while(y != toY) {
                robot.stepForward();
            }
        }
        if (y < toY) {
            while(direction != Direction.UP) {
                robot.turnLeft();
            }
            while(y != toY) {
                robot.stepForward();
            }
        }






      //write your solution here
    }
}
