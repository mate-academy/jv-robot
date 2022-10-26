package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX > robot.getX()) {


            while (robot.getDirection() != Direction.RIGHT) {
              robot.turnRight();

            }
        }

        if (toX < robot.getX()) {

            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();

            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();

        }

        if (toY > robot.getY()) {

            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
