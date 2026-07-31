package core.basesyntax;

public class RobotRoute {
    public static void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        int stepsByX = toX - robot.getX();
        int stepsByY = toY - robot.getY();

        Direction moveX = (stepsByX > 0) ? Direction.RIGHT : Direction.LEFT;
        Direction moveY = (stepsByY > 0) ? Direction.UP : Direction.DOWN;

        // Поворачиваем по X
        while (robot.getDirection() != moveX) {
            robot.turnLeft();
        }

        // Двигаем по X
        for (int x = 1; x <= Math.abs(stepsByX); x++) {
            robot.stepForward();
        }

        // Поворачиваем по Y
        while (robot.getDirection() != moveY) {
            robot.turnRight();
        }

        // Двигаем по Y
        for (int y = 1; y <= Math.abs(stepsByY); y++) {
            robot.stepForward();
        }
    }
}
