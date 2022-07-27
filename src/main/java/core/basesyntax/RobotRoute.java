package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Розвертаємо робота по осі Х в правильному напрямку
        if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }

            // Рухаємо робота до потрібної точки по осі Х коли ми в мінусовій позиції
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnRight();
            }

            // Рухаємо робота до потрібної точки по осі Х коли ми в плюсовій позиції
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }

        // Розвертаємо робота по осі Y в правильному напрямку
        if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }

            // Рухаємо робота до потрібної точки по осі Y коли ми в мінусовій позиції
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }

            // Рухаємо робота до потрібної точки по осі Y коли ми в плюсовій позиції
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }

    }
}
