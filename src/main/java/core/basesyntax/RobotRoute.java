package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Рух по осі X
        if (robot.getX() < toX) {
            // Поворот у напрямку RIGHT
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            // Рух вперед до досягнення координати toX
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            // Поворот у напрямку LEFT
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            // Рух вперед до досягнення координати toX
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }

        // Рух по осі Y
        if (robot.getY() < toY) {
            // Поворот у напрямку UP
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            // Рух вперед до досягнення координати toY
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            // Поворот у напрямку DOWN
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            // Рух вперед до досягнення координати toY
            while (robot.getY() > toY) {
                robot.stepForward();
            }
        }
    }
}
