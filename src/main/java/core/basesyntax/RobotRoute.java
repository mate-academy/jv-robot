package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction neededDirectionX = robot.getDirection(); // determination of needed X direction
        if (toX > robot.getX()) {
            neededDirectionX = Direction.RIGHT;
        }
        if (toX < robot.getX()) {
            neededDirectionX = Direction.LEFT;
        }
        while (neededDirectionX != robot.getDirection()) {
            robot.turnLeft();
        } // turning robot to match needed X direction
        int neededStepsX = Math.abs(toX - robot.getX());
        for (int i = 0; i < neededStepsX; i++) {
            robot.stepForward();
        }

        Direction neededDirectionY = robot.getDirection(); // determination of needed Y direction
        if (toY > robot.getY()) {
            neededDirectionY = Direction.UP;
        }
        if (toY < robot.getY()) {
            neededDirectionY = Direction.DOWN;
        }
        while (neededDirectionY != robot.getDirection()) {
            robot.turnLeft();
        } // turning robot to match needed Y direction
        int neededStepsY = Math.abs(toY - robot.getY());
        for (int i = 0; i < neededStepsY; i++) {
            robot.stepForward();
        }
    }
}
