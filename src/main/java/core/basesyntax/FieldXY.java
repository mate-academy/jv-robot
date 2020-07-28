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
        //your code

        while (robot.getX() != toX) {
            if (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (toY > robot.getY()) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            robot.stepForward();
        }
    }
}

