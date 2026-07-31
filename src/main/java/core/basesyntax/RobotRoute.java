package core.basesyntax;

public class RobotRoute {
    private int wayX;
    private int wayY;

    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            wayX = toX - robot.getX();
            robot.turnRight();
        } else {
            wayX = robot.getX() - toX;
            robot.turnLeft();
        }
        for (int i = 0; i < wayX; i++) {
            robot.stepForward();
        }
        if (toY > robot.getY()) {
            wayY = toY - robot.getY();
            robot.turnUp();
        } else {
            wayY = robot.getY() - toY;
            robot.turnDown();
        }
        for (int i = 0; i < wayY; i++) {
            robot.stepForward();
        }

    }
}
