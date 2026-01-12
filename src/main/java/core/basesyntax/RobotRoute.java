package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        Robot johnny = new Robot(robot.getDirection(), robot.getX(), robot.getY());

        while (johnny.getDirection() != Direction.RIGHT) {
            johnny.turnRight();
        }
        while (johnny.getX() != toX) {
            johnny.stepForward();
        }
        while (johnny.getDirection() != Direction.LEFT) {
            johnny.turnLeft();
        }
        while (johnny.getY() != toY) {
            johnny.stepForward();
        }
    }
}
