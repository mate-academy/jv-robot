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

        for (int i = 0; i < 3; i++) {
            if ((toX > robot.getX() && robot.getDirection() != Direction.RIGHT)
                    || toX < robot.getX() && robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        for (int i = 0; i < 3; i++) {
            if ((toY > robot.getY() && robot.getDirection() != Direction.UP)
                    || toY < robot.getY() && robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

