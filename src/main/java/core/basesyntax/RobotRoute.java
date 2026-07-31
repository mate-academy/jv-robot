package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int goToX = Math.abs(toX - robot.getX());
        int goToY = Math.abs(toY - robot.getY());
        Direction direcX = toX <= robot.getX()
                               ? Direction.LEFT
                               : Direction.RIGHT;
        Direction direcY = toY <= robot.getY()
                               ? Direction.DOWN
                               : Direction.UP;
        for (int g = 0; g < 2; g++) {
            while (!robot.getDirection().equals(direcX)) {
                robot.turnRight();
            }
            direcX = direcY;
            for (int i = 0; i < goToX; i++) {
                robot.stepForward();
            }
            goToX = goToY;
        }
    }
}
