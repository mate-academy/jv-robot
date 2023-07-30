package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int valueX = robot.getX();
        int valueY = robot.getY();

        if (valueX == toX && valueY == toY) {
            System.out.println("Робот вдома");
            return;
        }
        while (valueX != toX || valueY != toY) {
            // Зміна напрямку руху для досягнення точки toX
            if (valueX < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (valueX > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }

            // Зміна напрямку руху для досягнення точки toY
            if (valueY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
            } else if (valueY > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            // Виконуємо крок вперед
            robot.stepForward();

            // Оновлюємо поточні координати робота
            valueX = robot.getX();
            valueY = robot.getY();
        }
        System.out.println("Робот досяг цільової точки (" + toX + ", " + toY + ").");
    }
}
