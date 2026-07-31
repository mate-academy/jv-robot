package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentX = robot.getX();
        int currentY = robot.getY();

        // Пока робот не достигнет целевой позиции (toX, toY)
        while (currentX != toX || currentY != toY) {
            // Проверяем, нужно ли роботу двигаться по горизонтали или вертикали
            if (currentX != toX) {
                // Если текущая координата X не равна целевой, то двигаемся по горизонтали
                moveHorizontally(robot, currentX, toX);
                // Обновляем текущие координаты робота после горизонтального перемещения
                currentX = robot.getX();
            } else {
                // Аналогично для движения по вертикали
                moveVertically(robot, currentY, toY);
                // Обновляем текущие координаты робота после вертикального перемещения
                currentY = robot.getY();
            }
        }
    }

    // Метод для перемещения робота по горизонтали
    private void moveHorizontally(Robot robot, int currentX, int targetX) {
        // Определяем направление движения
        Direction direction = currentX < targetX ? Direction.RIGHT : Direction.LEFT;
        // Поворачиваем робота в нужном направлении
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        // Двигаемся вперед, пока не достигнем целевой позиции по горизонтали
        while (robot.getX() != targetX) {
            robot.stepForward();
        }
    }

    // Метод для перемещения робота по вертикали
    private void moveVertically(Robot robot, int currentY, int targetY) {
        // Определяем направление движения
        Direction direction = currentY < targetY ? Direction.UP : Direction.DOWN;
        // Поворачиваем робота в нужном направлении
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        // Двигаемся вперед, пока не достигнем целевой позиции по вертикали
        while (robot.getY() != targetY) {
            robot.stepForward();
        }
    }
}
