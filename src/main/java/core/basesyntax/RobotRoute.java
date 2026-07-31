package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
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

        while (robot.getX() != toX) {
            robot.stepForward();
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

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
