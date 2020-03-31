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
        turnTo(robot, toX, Direction.LEFT, Direction.RIGHT);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        turnTo(robot, toY, Direction.DOWN, Direction.UP);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void turnTo(Robot robot, int coordinate, Direction route1, Direction route2) {
        Direction direction = coordinate < 0 ? route1 : route2;
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}

