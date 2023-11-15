package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (toX != robot.getX()) {
            while (robot.getDirection() != (toX > robot.getX()
                    ? Direction.RIGHT : Direction.LEFT)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (toY != robot.getY()) {
            while (robot.getDirection() != (toY > robot.getY()
                    ? Direction.UP : Direction.DOWN)) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }
}
