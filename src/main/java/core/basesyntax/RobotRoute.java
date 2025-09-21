package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        Direction currentDirection = robot.getDirection();
        int currentY = robot.getY();

        if (toX > currentX) {
            switch (currentDirection) {
                case LEFT: {
                    robot.turnRight();
                    robot.turnRight();
                    break;
                }
                case UP: {
                    robot.turnRight();
                    break;
                }
                case DOWN: {
                    robot.turnLeft();
                    break;
                }
                default: {
                    break;
                }
            }

            for (int i = 0; i < toX - currentX; i++) {
                robot.stepForward();
            }
        }

        if (toX < currentX) {
            switch (currentDirection) {
                case RIGHT: {
                    robot.turnRight();
                    robot.turnRight();
                    break;
                }
                case UP: {
                    robot.turnLeft();
                    break;
                }
                case DOWN: {
                    robot.turnRight();
                    break;
                }
                default: {
                    break;
                }
            }

            for (int i = 0; i < currentX - toX; i++) {
                robot.stepForward();
            }
        }

        currentDirection = robot.getDirection();

        if (toY > currentY) {
            switch (currentDirection) {
                case RIGHT: {
                    robot.turnLeft();
                    break;
                }
                case LEFT: {
                    robot.turnRight();
                    break;
                }
                case DOWN: {
                    robot.turnRight();
                    robot.turnRight();
                    break;
                }
                default: {
                    break;
                }
            }

            for (int i = 0; i < toY - currentY; i++) {
                robot.stepForward();
            }
        }

        if (toY < currentY) {
            switch (currentDirection) {
                case RIGHT: {
                    robot.turnRight();
                    break;
                }
                case LEFT: {
                    robot.turnLeft();
                    break;
                }
                case UP: {
                    robot.turnRight();
                    robot.turnRight();
                    break;
                }
                default: {
                    break;
                }
            }

            for (int i = 0; i < currentY - toY; i++) {
                robot.stepForward();
            }
        }
    }
}
