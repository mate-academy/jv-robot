package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // Рух по горизонталі (по X)
        if (robot.getX() < toX) {
            // Робот повинен рухатися вправо
            rotateRobot(robot, Direction.RIGHT);
            while (robot.getX() < toX) {
                robot.stepForward(); // Рухаємось вперед, поки не досягнемо цілі
            }
        } else if (robot.getX() > toX) {
            // Робот повинен рухатися вліво
            rotateRobot(robot, Direction.LEFT);
            while (robot.getX() > toX) {
                robot.stepForward(); // Рухаємось вперед, поки не досягнемо цілі
            }
        }

        // Рух по вертикалі (по Y)
        if (robot.getY() < toY) {
            // Робот повинен рухатися вгору
            rotateRobot(robot, Direction.UP);
            while (robot.getY() < toY) {
                robot.stepForward(); // Рухаємось вперед, поки не досягнемо цілі
            }
        } else if (robot.getY() > toY) {
            // Робот повинен рухатися вниз
            rotateRobot(robot, Direction.DOWN);
            while (robot.getY() > toY) {
                robot.stepForward(); // Рухаємось вперед, поки не досягнемо цілі
            }
        }
    }

    private void rotateRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            // Обираємо найкоротший шлях обертання
            if (shouldTurnLeft(robot.getDirection(), targetDirection)) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
    }

    private boolean shouldTurnLeft(Direction currentDirection, Direction targetDirection) {
        // Визначаємо, чи буде обертання ліворуч коротшим
        return (currentDirection == Direction.UP && targetDirection == Direction.LEFT)
                ||
                (currentDirection == Direction.LEFT && targetDirection == Direction.DOWN)
                ||
                (currentDirection == Direction.DOWN && targetDirection == Direction.RIGHT)
                ||
                (currentDirection == Direction.RIGHT && targetDirection == Direction.UP);
    }
}
