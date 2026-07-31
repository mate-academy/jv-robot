package core.basesyntax;

public class RobotRoute {
    // Method has less than 30 lines so I decided not to divide this method.
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            boolean isTurnRight;
            switch (robot.getDirection()) {
                case UP -> {
                    robot.stepForward();
                    isTurnRight = toX > robot.getX();
                }
                case DOWN -> {
                    robot.stepForward();
                    isTurnRight = toX < robot.getX();
                }
                case LEFT -> {
                    robot.stepForward();
                    isTurnRight = toY > robot.getY();
                }
                case RIGHT -> {
                    robot.stepForward();
                    isTurnRight = toY < robot.getY();
                }
                default -> isTurnRight = false;
            }
            if (isTurnRight) {
                robot.turnRight();
            } else {
                robot.turnLeft();
            }
        }
    }
}

