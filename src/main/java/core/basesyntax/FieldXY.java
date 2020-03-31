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
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        int x = toX - robot.getX();
        int y = toY - robot.getY();
        int zero = 0;
        if (x >= zero) {
            robot.turnRight();
            while (x > zero) {
                robot.stepForward();
                x--;
            }
            robot.turnLeft();
        } else {
            robot.turnLeft();
            while (x != zero) {
                robot.stepForward();
                x++;
            }
            robot.turnRight();
        }
        if (y >= zero) {

            while (y > zero) {
                robot.stepForward();
                y--;
            }
        } else {
            robot.turnRight();
            robot.turnRight();
            while (y < zero) {
                robot.stepForward();
                y++;
            }
        }
    }
}

