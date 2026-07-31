package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Отримуємо поточні координати та напрямок робота
        int currentX = robot.getX();
        int currentY = robot.getY();
        Direction currentDirection = robot.getDirection();

        // Визначаємо напрямок руху по X (вліво або вправо)
        if (currentX < toX) {
            while (currentDirection != Direction.RIGHT) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
        } else if (currentX > toX) {
            while (currentDirection != Direction.LEFT) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
        }

        // Рухаємося до цільової координати X
        while (currentX != toX) {
            robot.stepForward();
            currentX = robot.getX();
        }

        // Визначаємо напрямок руху по Y (вгору або вниз)
        if (currentY < toY) {
            while (currentDirection != Direction.UP) {
                robot.turnLeft();
                currentDirection = robot.getDirection();
            }
        } else if (currentY > toY) {
            while (currentDirection != Direction.DOWN) {
                robot.turnRight();
                currentDirection = robot.getDirection();
            }
        }

        // Рухаємося до цільової координати Y
        while (currentY != toY) {
            robot.stepForward();
            currentY = robot.getY();
        }
    }
}
