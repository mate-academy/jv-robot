package core.basesyntax;

public class RobotRoute {
    private Robot robot;
    private int toX;
    private int toY;

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot == null) {
            throw new IllegalArgumentException("Robot must be present (not null)");
        }

        this.robot = robot;
        this.toX = toX;
        this.toY = toY;

        this.setXAxisDirection();
        this.performXAxisMovement();

        this.setYAxisDirection();
        this.performYAxisMovement();
    }

    private void setXAxisDirection() {
        if (toX > robot.getX()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
        } else if (toX < robot.getX()) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
        }
    }

    private void setYAxisDirection() {
        if (toY > robot.getY()) {
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
        } else if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void performXAxisMovement() {
        int deltaX = Math.abs(toX - robot.getX());
        for (int i = 0; i < deltaX; i++) {
            robot.stepForward();
        }
    }

    private void performYAxisMovement() {
        int deltaY = Math.abs(toY - robot.getY());
        for (int i = 0; i < deltaY; i++) {
            robot.stepForward();
        }
    }
}
