package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction dirByX = (toX < robot.getX()) ? Direction.LEFT : Direction.RIGHT;
        changeForX(robot, dirByX, toX);

        Direction dirByY = (toY < robot.getY()) ? Direction.DOWN : Direction.UP;
        changeForY(robot, dirByY, toY);
    }

    private void changeForX(Robot robot, Direction expectedDir, int expX) {
        while (!robot.getDirection().equals(expectedDir)) {
            robot.turnLeft();
        }
        if (expectedDir.name().equals("LEFT")) {
            for (int i = robot.getX(); i > expX; i--) {
                robot.stepForward();
            }
        } else {
            for (int i = robot.getX(); i < expX; i++) {
                robot.stepForward();
            }
        }
    }

    private void changeForY(Robot robot, Direction expectedDir, int expY) {
        while (!robot.getDirection().equals(expectedDir)) {
            robot.turnLeft();
        }
        if (expectedDir.name().equals("DOWN")) {
            for (int i = robot.getY(); i > expY; i--) {
                robot.stepForward();
            }
        } else {
            for (int i = robot.getY(); i < expY; i++) {
                robot.stepForward();
            }
        }
    }
}
