package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Спочатку рухаємося по осі X
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                // Потрібно рухатися вправо
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else {
                // Потрібно рухатися вліво
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }

        // Тепер рухаємося по осі Y
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                // Потрібно рухатися вгору
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else {
                // Потрібно рухатися вниз
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }
    }
}
