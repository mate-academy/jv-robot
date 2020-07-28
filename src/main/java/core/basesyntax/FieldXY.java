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

        Direction robotDirection;

        if (robot.getX() != toX) {

            robotDirection = (robot.getX() < toX) ? Direction.RIGHT : Direction.LEFT;

            while (!robotDirection.equals(robot.getDirection())) {
                robot.turnLeft();
            }
            while (!(robot.getX() == toX)) {
                robot.stepForward();
            }
        }

        if (robot.getY() != toY) {

            robotDirection = (robot.getY() < toY) ? Direction.DOWN : Direction.UP;

            while (!(robot.getDirection().equals(robotDirection))) {
                robot.turnRight();
            }
            while (!(robot.getY() == toY)) {
                robot.stepForward();
            }
        }
    }
}
