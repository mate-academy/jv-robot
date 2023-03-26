package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int pathByX = Math.abs(toX) + Math.abs(robot.getX());
        final int pathByY = Math.abs(toY) + Math.abs(robot.getY());
        if (moveByX(robot.getX(), toX) == Direction.LEFT) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < pathByX; i++) {
            if (toX != robot.getX()) {
                robot.stepForward();
            }
        }
        if (moveByY(robot.getY(), toY) == Direction.DOWN) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        for (int i = 0; i < pathByY; i++) {
            if (toY != robot.getY()) {
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 4, 3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, -2, -2);
    }

    public Direction moveByX(int startX, int endX) {
        return startX > endX ? Direction.LEFT : Direction.RIGHT;
    }

    public Direction moveByY(int startY, int endY) {
        return startY > endY ? Direction.DOWN : Direction.UP;
    }
}
