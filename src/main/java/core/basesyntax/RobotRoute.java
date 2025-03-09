package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        if (toX != x) {
            Direction targetX = (toX > x) ? Direction.RIGHT : Direction.LEFT;
            changeRobotDirection(robot, targetX);
            while (toX != x) {
                robot.stepForward();
                x = robot.getX();
            }
        }
        if (toY != y) {
            Direction targetY = (toY > y) ? Direction.UP : Direction.DOWN;
            changeRobotDirection(robot, targetY);
            while (toY != y) {
                robot.stepForward();
                y = robot.getY();
            }
        }
    }

    public static void changeRobotDirection(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
}
