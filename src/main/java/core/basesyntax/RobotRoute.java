package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int stepsX = Math.abs(robot.getX() - toX);

        changeDirectionX(robot, toX);
        for (int i = 0; i < stepsX; i++) {
            robot.stepForward();
        }

        int stepsY = Math.abs(robot.getY() - toY);

        changeDirectionY(robot,toY);
        for (int i = 0; i < stepsY; i++) {
            robot.stepForward();
        }

    }

    private void changeDirectionX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        }
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        }
    }

    private void changeDirectionY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        }
    }
}
