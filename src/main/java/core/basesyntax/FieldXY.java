package core.basesyntax;

/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя
 * целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх.(Помните, как рисовали
 * графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * Реализуйте метод moveRobot()</p>
 */
public class FieldXY {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (!moveXDone(robot, toX)) {
            while (!correctDirectionAlongX(robot.getDirection(), robot.getX(), toX)) {
                robot.turnRight();
            }
            while (!moveXDone(robot, toX)) {
                robot.stepForward();
            }
        }

        if (!moveYDone(robot, toY)) {
            while (!correctDirectionAlongY(robot.getDirection(), robot.getY(), toY)) {
                robot.turnRight();
            }
            while (!moveYDone(robot, toY)) {
                robot.stepForward();
            }
        }
    }

    private boolean correctDirectionAlongX(Direction robotDirection, int currentX, int targetX) {
        return correctOffset(directionToXOffset(robotDirection), targetX - currentX);
    }

    private boolean correctDirectionAlongY(Direction robotDirection, int currentY, int targetY) {
        return correctOffset(directionToYOffset(robotDirection), targetY - currentY);
    }

    private boolean correctOffset(int offset, int distance) {
        return (long) offset * distance > 0;
    }

    private boolean moveYDone(Robot robot, int toY) {
        return robot.getY() == toY;
    }

    private boolean moveXDone(Robot robot, int toX) {
        return robot.getX() == toX;
    }

    private int directionToXOffset(Direction direction) {
        switch (direction) {
            case LEFT:
                return -1;
            case RIGHT:
                return 1;
            default:
                return 0;
        }
    }

    private int directionToYOffset(Direction direction) {
        switch (direction) {
            case DOWN:
                return -1;
            case UP:
                return 1;
            default:
                return 0;
        }
    }
}

