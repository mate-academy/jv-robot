package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                while (Direction.LEFT != robot.getDirection()) {
                    robot.turnRight();
                }
            } else {
                while (Direction.RIGHT != robot.getDirection()) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                while (Direction.DOWN != robot.getDirection()) {
                    robot.turnRight();
                }
            } else {
                while (Direction.UP != robot.getDirection()) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }
}
