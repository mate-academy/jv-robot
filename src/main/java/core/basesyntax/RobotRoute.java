package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int isX = robot.getX();
        int isY = robot.getY();
        int stepX = isX > toX ? isX - toX : isX < toX ? toX - isX : 0;
        int stepY = isY > toY ? isY - toY : isY < toY ? toY - isY : 0;

        if (stepX == 0 && stepY == 0) {
            return;
        }

        switch (robot.getDirection()) {
            case UP:
                if (isX < toX) {
                    robot.turnRight();
                }
                if (isX > toX) {
                    robot.turnLeft();
                }
                if (isX == toX) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (isX < toX) {
                    robot.turnLeft();
                }
                if (isX > toX) {
                    robot.turnRight();
                }
                if (isX == toX) {
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (isX < toX) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (isX > toX) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            default:
                break;
        }

        if (isX != toX) {
            for (int i = 0; i < stepX; i++) {
                robot.stepForward();
            }
        }

        switch (robot.getDirection()) {
            case LEFT:
                if (isY < toY) {
                    robot.turnRight();
                }
                if (isY > toY) {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (isY < toY) {
                    robot.turnLeft();
                }
                if (isY > toY) {
                    robot.turnRight();
                }
                break;
            default:
                break;
        }

        if (isY != toY) {
            for (int i = 0; i < stepY; i++) {
                robot.stepForward();
            }
        }
    }
}
