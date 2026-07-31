package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (toX < currentX) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                default:
            }
            for (int i = 0; i < currentX - toX; i++) {
                robot.stepForward();
            }
        }

        if (toX > currentX) {
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
            for (int i = 0; i < toX - currentX; i++) {
                robot.stepForward();
            }
        }

        if (toY < currentY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
            }
            for (int i = 0; i < currentY - toY; i++) {
                robot.stepForward();
            }
        }

        if (toY > currentY) {
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
            for (int i = 0; i < toY - currentY; i++) {
                robot.stepForward();
            }
        }
    }
}
