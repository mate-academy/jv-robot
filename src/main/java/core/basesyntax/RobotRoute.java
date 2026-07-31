package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            rotateHorizontally(robot, toX);
            int counter = Math.abs(toX - robot.getX());
            moveByAxis(robot, counter);
        }
        if (robot.getY() != toY) {
            rotateVertically(robot, toY);
            int counter = Math.abs(toY - robot.getY());
            moveByAxis(robot, counter);
        }
    }

    private void rotateHorizontally(Robot robot, int toX) {
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                default:
            }
        } else {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                default:
            }
        }
    }

    private void rotateVertically(Robot robot, int toY) {
        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                default:
            }
        } else {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case UP:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                default:
            }
        }
    }

    private void moveByAxis(Robot robot, int counter) {
        for (int i = counter; i > 0; i--) {
            robot.stepForward();
        }
    }
}
