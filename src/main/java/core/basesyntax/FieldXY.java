package core.basesyntax;

public class FieldXY {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

