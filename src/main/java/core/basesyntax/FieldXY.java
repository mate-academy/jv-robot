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
        if (robot.getX() > toX) {
            newDirection(robot, Direction.RIGHT);
        } else {
            newDirection(robot, Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }

        if (robot.getY() > toY) {
            newDirection(robot, Direction.DOWN);
        } else {
            newDirection(robot, Direction.UP);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private static void newDirection (Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }
}

