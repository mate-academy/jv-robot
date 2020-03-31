package core.basesyntax;

import java.util.function.IntSupplier;

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
        moveAlongAxis(robot, (toX - robot.getX()) < 0 ? Direction.LEFT : Direction.RIGHT,
                      robot::getX, toX);
        moveAlongAxis(robot, (toY - robot.getY()) < 0 ? Direction.DOWN : Direction.UP,
                      robot::getY, toY);
    }

    private void moveAlongAxis(Robot robot, Direction correctStartDirection,
                               IntSupplier current, int target) {
        if (current.getAsInt() != target) {
            while (robot.getDirection() != correctStartDirection) {
                robot.turnRight();
            }
            while (current.getAsInt() != target) {
                robot.stepForward();
            }
        }
    }
}
