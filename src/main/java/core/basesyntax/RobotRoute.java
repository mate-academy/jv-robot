package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getX() != toX) {

            while (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }
            while (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }

        }
        while (robot.getY() != toY) {

            while (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            while (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
    }
}
