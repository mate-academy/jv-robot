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

    private void moveToY(Robot r, int targetY) {
        if (r.getY() < targetY) {
            while (r.getDirection() != Direction.UP) {
                r.turnRight();
            }
        } else if (r.getY() > targetY) {
            while (r.getDirection() != Direction.DOWN) {
                r.turnLeft();
            }
        }

        while (r.getY() != targetY) {
            r.stepForward();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        moveToX(robot, toX);
        moveToY(robot, toY);
    }
}
