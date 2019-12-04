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
        final int maxSideWorldValue = 4;
        Direction vectorDirectionX = toX - robot.getX() > 0 ? Direction.RIGHT : Direction.LEFT;
        Direction vectorDirectionY = toY - robot.getY() > 0 ? Direction.UP : Direction.DOWN;
        for (int i = 0; i <= maxSideWorldValue; i++) {
            if (robot.getDirection().equals(vectorDirectionX) && toX != robot.getX()) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getDirection().equals(vectorDirectionY) && toY != robot.getY()) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else {
                robot.turnRight();
            }
        }
    }
}
