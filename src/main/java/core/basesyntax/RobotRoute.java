package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot r, int toX, int toY) {
        if (r.getX() > toX) {
            while (r.getDirection() != Direction.LEFT) {
                r.turnLeft();
            }
            while (r.getX() != toX) {
                r.stepForward();
            }
        } else {
            while (r.getDirection() != Direction.RIGHT) {
                r.turnRight();
            }
            while (r.getX() != toX) {
                r.stepForward();
            }
        }
        if (r.getY() > toY) {
            while (r.getDirection() != Direction.DOWN) {
                r.turnLeft();
            }
            while (r.getY() != toY) {
                r.stepForward();
            }
        } else {
            while (r.getDirection() != Direction.UP) {
                r.turnRight();
            }
            while (r.getY() != toY) {
                r.stepForward();
            }
        }
    }
}
