package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int distX = robot.getX() - toX;
        int distY = robot.getY() - toY;

        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            default:
                break;
        }

        if (robot.getX() < 0) {
            robot.turnRight();
            robot.turnRight();
        }

        while (distX != 0) {
            robot.stepForward();
            distX--;
        }

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

        if (robot.getY() < 0) {
            robot.turnRight();
            robot.turnRight();
        }

        while (distY != 0) {
            robot.stepForward();
            distY--;
        }
    }
}
