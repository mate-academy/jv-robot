package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Robot з випадковими початковими координатами і напрямком
        Robot robot = new Robot(Direction.UP, 0, 0);

        // Задаємо цільові координати, до яких ми хочемо перемістити робота
        int toX = 5;
        int toY = -4;

        // Створюємо об'єкт класу RobotRoute
        RobotRoute robotRoute = new RobotRoute();

        // Викликаємо метод moveRobot для переміщення робота до цільових координат
        robotRoute.moveRobot(robot, toX, toY);
    }
}
