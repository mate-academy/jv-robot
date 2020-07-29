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
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        } else {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

