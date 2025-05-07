package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();

        Direction robotDirectionAnxisX = (startX < toX) ? Direction.RIGHT : Direction.LEFT;
        while (robot.getX() != toX) {
            while (robot.getDirection() != robotDirectionAnxisX) {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        Direction robotDirectionAnxisY = (startY < toY) ? Direction.UP : Direction.DOWN;
        while (robot.getY() != toY) {
            while (robot.getDirection() != robotDirectionAnxisY) {
                robot.turnLeft();
            }
            robot.stepForward();
        }
    }
}
