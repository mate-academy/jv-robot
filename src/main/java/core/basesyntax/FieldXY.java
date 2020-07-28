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
        int initialPositionX = robot.getX();
        if (toX >= initialPositionX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (toX != initialPositionX) {
                robot.stepForward();
                initialPositionX++;
            }
        } else {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (toX != initialPositionX) {
                robot.stepForward();
                initialPositionX--;
            }
        }
        int initialPositionY = robot.getY();
        if (toY >= initialPositionY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (toY != initialPositionY) {
                robot.stepForward();
                initialPositionY++;
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (toY != initialPositionY) {
                robot.stepForward();
                initialPositionY--;
            }
        }
    }
}

