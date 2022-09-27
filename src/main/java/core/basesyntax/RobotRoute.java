package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int[] steps = {
                Math.abs(robot.getX() - toX),
                Math.abs(robot.getY() - toY)
        };
        Direction[] directions = {
                robot.getX() <= toX ? Direction.RIGHT : Direction.LEFT,
                robot.getY() <= toY ? Direction.UP : Direction.DOWN
        };
        for (int direction = 0; direction < 2; direction++) {
            while (!directions[direction].equals(robot.getDirection())) {
                robot.turnRight();
            }
            for (int step = 0; step < steps[direction]; step++) {
                robot.stepForward();
            }
        }
    }
}
