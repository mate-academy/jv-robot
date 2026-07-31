package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Шаг 1: Двигаемся по оси X (влево или вправо)
        while (robot.getX() != toX) {
            // Убедимся, что робот смотрит в правильную сторону
            if (robot.getX() < toX) {
                // Нужно двигаться вправо
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                // Нужно двигаться влево
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
            }
            // Делаем шаг вперёд
            robot.stepForward();
        }

        // Шаг 2: Двигаемся по оси Y (вверх или вниз)
        while (robot.getY() != toY) {
            // Убедимся, что робот смотрит в правильную сторону
            if (robot.getY() < toY) {
                // Нужно двигаться вверх
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else {
                // Нужно двигаться вниз
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            // Делаем шаг вперёд
            robot.stepForward();
        }
    }
}
