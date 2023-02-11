package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getY() != toY) {
            while (!robot.getDirection().equals(Direction.DOWN) && robot.getY() > toY) {
                robot.turnLeft();
            }
            while (!robot.getDirection().equals(Direction.UP) && robot.getY() < toY) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(robot.getY() - toY); i++) {
                robot.stepForward();
            }
        }
        while (robot.getX() != toX) {
            while ((!robot.getDirection().equals(Direction.LEFT)) && robot.getX() > toX) {
                robot.turnLeft();
            }
            while ((!robot.getDirection().equals(Direction.RIGHT)) && robot.getX() < toX) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(robot.getX() - toX); i++) {
                robot.stepForward();
            }
        }
    }
}



