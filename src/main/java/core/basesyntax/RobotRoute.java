package core.basesyntax;

public class RobotRoute {
    private void moveToX(Robot r, int targetX) {
        if (r.getX() < targetX) {
            while (r.getDirection() != Direction.RIGHT) {
                r.turnRight();
            }
        } else if (r.getX() > targetX) {
            while (r.getDirection() != Direction.LEFT) {
                r.turnLeft();
            }
        }

        while (r.getX() != targetX) {
            r.stepForward();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {

    }
}
