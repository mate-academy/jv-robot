package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int vectorX = toX - robot.getX();
        int vectorY = toY - robot.getY();

        Direction targetXDirection = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        Direction targetYDirection = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (!(robot.getX() == toX && robot.getY() == toY)) {
            if (targetXDirection == robot.getDirection()) {
                for (int i = 0; i < Math.abs(vectorX); i++) {
                    robot.stepForward();
                }
            } else if (targetYDirection == robot.getDirection()) {
                for (int i = 0; i < Math.abs(vectorY); i++) {
                    robot.stepForward();
                }
            }
            robot.turnRight();;
        }
        //alternative, safer way is using two while and to cycles with step forward
    }
}
