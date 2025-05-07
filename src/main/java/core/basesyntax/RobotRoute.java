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
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                default:
            }
        } else if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();;
                    break;
                default:
            }
        }
    }

    private void setYAxisDirection() {
        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
            }
        } else if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
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
