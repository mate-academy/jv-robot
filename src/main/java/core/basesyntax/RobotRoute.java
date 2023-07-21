package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        int thisX = robot.getX();
        int thisY = robot.getY();
        if (thisY >= toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < thisY - toY; i++) {
                robot.stepForward();
            }
            if (thisX > toX) {
                robot.turnRight();
                for (int i = 0; i < thisX - toX; i++) {
                    robot.stepForward();
                }
            }
            if (thisX < toX) {
                robot.turnLeft();
                for (int i = 0; i < toX - thisX; i++) {
                    robot.stepForward();
                }
            }
        }
        if (thisY < toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = 0; i < toY - thisY; i++) {
                robot.stepForward();
            }
            if (thisX > toX) {
                robot.turnLeft();
                for (int i = 0; i < thisX - toX; i++) {
                    robot.stepForward();
                }
            }
            if (thisX < toX) {
                robot.turnRight();
                for (int i = 0; i < toX - thisX; i++) {
                    robot.stepForward();
                }
            }
        }
    }
}
