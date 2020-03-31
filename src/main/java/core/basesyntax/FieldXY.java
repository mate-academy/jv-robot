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
        while (robot.getX() != toX || robot.getY() != toY) {
            int x = robot.getX();
            int y = robot.getY();
            if (toX > x) {
                turnTo(robot, Direction.RIGHT);
            } else if (toX < x) {
                turnTo(robot, Direction.LEFT);
            } else if (toY > y) {
                turnTo(robot, Direction.UP);
            } else if (toY < y) {
                turnTo(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void turnTo(Robot robot, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
    }
}
