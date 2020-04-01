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
            if (robot.getX() > toX) {
                choseDirection(robot, Direction.LEFT);
                robot.stepForward();
            } else {
                choseDirection(robot, Direction.RIGHT);
                robot.stepForward();
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                choseDirection(robot, Direction.DOWN);
                robot.stepForward();
            } else {
                choseDirection(robot, Direction.UP);
                robot.stepForward();
            }
        }
    }

    static void choseDirection(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}

