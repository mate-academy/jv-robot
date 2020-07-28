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

        Direction directionX = toX > robot.getX() ? Direction.RIGHT : Direction.LEFT;
        Direction directionY = toY > robot.getY() ? Direction.UP : Direction.DOWN;

        while (toX != robot.getX()) {
            while (directionX != robot.getDirection()) {
                robot.turnRight();
            }
            robot.stepForward();
        }
        while (toY != robot.getY()) {
            while (directionY != robot.getDirection()) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }
}

