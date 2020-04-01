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
        movingByX(robot, toX);
        movingByY(robot, toY);
    }

    public static void movingByX(Robot robot, int toXorY) {
        if (robot.getX() > toXorY) {
            turning(robot, Direction.LEFT);
        } else {
            turning(robot, Direction.RIGHT);
        }
        while (robot.getX() != toXorY) {
            robot.stepForward();
        }
    }

    public static void movingByY(Robot robot, int toXorY) {
        if (robot.getY() > toXorY) {
            turning(robot, Direction.DOWN);
        } else {
            turning(robot, Direction.UP);
        }
        while (robot.getY() != toXorY) {
            robot.stepForward();
        }
    }

    public static void turning(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}
