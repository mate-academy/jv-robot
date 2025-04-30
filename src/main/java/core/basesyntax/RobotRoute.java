package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = toX - robot.getX();
        int distanceY = toY - robot.getY();

        moveThroughX(robot, distanceX, toX);
        moveThroughY(robot, distanceY, toY);
    }

    private void moveThroughX(Robot robot, int distanceX, int toX) {
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

        if (distanceX < 0) {
            robot.turnRight();
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void moveThroughY(Robot robot, int distanceY, int toY) {
        switch (robot.getDirection()) {
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
                break;
        }

        if (distanceY < 0) {
            robot.turnLeft();
            robot.turnLeft();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
