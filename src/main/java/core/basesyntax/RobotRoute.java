package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            while (Direction.LEFT != robot.getDirection()) {
                robot.turnLeft();
            }
        } else {
            while (Direction.RIGHT != robot.getDirection()) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            while (Direction.DOWN != robot.getDirection()) {
                robot.turnRight();
            }
        } else {
            while (Direction.UP != robot.getDirection()) {
                robot.turnLeft();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
