package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Axis X
        int prev = Math.abs(robot.getX() - toX);
        while (toX != robot.getX()) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.stepForward();
                    break;
                case RIGHT:
                    robot.stepForward();
                    break;
                default:
                    break;
            }
            if (prev <= Math.abs(robot.getX() - toX)) {
                robot.turnLeft();
            }
            prev = Math.abs(robot.getX() - toX);
        }
        prev = Math.abs(robot.getY() - toY);
        while (toY != robot.getY()) {
            switch (robot.getDirection()) {
                case UP:
                    robot.stepForward();
                    break;
                case DOWN:
                    robot.stepForward();
                    break;
                default:
                    break;
            }
            if (prev <= Math.abs(robot.getY() - toY)) {
                robot.turnLeft();
            }
            prev = Math.abs(robot.getY() - toY);
        }
    }
}
