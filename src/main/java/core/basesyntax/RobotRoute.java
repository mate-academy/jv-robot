package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        switch (robot.getDirection()) {
            case RIGHT:
                if (toY > 0) {
                    robot.turnLeft();
                } else if (toY < 0) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (toY > 0) {
                    robot.turnRight();
                } else if (toY < 0) {
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
        switch (robot.getDirection()) {
            case UP:
                if (toX > 0) {
                    robot.turnRight();
                } else if (toX < 0) {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (toX > 0) {
                    robot.turnLeft();
                } else if (toX < 0) {
                    robot.turnRight();
                }
                break;
            case LEFT:
                if (toX > 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (toX < 0) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }
}





