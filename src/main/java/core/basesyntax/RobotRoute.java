package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        Direction startDir = robot.getDirection();

        switch (startDir) {
            case UP:
                if (robot.getX() > toX) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
                break;
            case DOWN:
                if (robot.getX() > toX) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
                break;
            case LEFT:
                if (robot.getX() < toX) {
                    robot.turnRight();
                    robot.turnRight();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
                break;
            case RIGHT:
                if (robot.getX() > toX) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
                break;
            default:
                break;
        }

        Direction currentDir = robot.getDirection();

        switch (currentDir) {
            case LEFT:
                if (robot.getY() > toY) {
                    robot.turnLeft();
                }else {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            case RIGHT:
                if (robot.getY() > toY) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            default:
                break;
        }
    }
}
