package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        if (robot.getX() <= toX && robot.getY() <= toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    break;
                default:
                    break;
            }

            while (robot.getX() < toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() <= toX && robot.getY() >= toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    break;
                default:
                    break;
            }

            while (robot.getX() < toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() >= toX && robot.getY() <= toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }

            while (robot.getX() > toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }
        if (robot.getX() >= toX && robot.getY() >= toY) {
            switch (robot.getDirection()) {
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }

            while (robot.getX() > toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}
