package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        do {
            int tempX = Math.abs(robot.getX() - toX);
            robot.stepForward();
            if (Math.abs(robot.getX() - toX) < tempX) {
                do {
                    robot.stepForward();
                } while (Math.abs(robot.getX() - toX) != 0);
            } else {
                robot.stepBack();
                robot.turnRight();
            }
        } while (Math.abs(robot.getX() - toX) != 0);

        do {
            int tempY = Math.abs(robot.getY() - toY);
            robot.stepForward();
            if (Math.abs(robot.getY() - toY) < tempY) {
                do {
                    robot.stepForward();
                } while (Math.abs(robot.getY() - toY) != 0);
            } else {
                robot.stepBack();
                robot.turnRight();
            }
        } while (Math.abs(robot.getY() - toY) != 0);
    }
}
