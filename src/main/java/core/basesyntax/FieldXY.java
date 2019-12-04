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

        int robotXCoordinate = robot.getX();
        Direction robotCurrentDirection = robot.getDirection();

        if (robotXCoordinate < toX) {
            while (robotCurrentDirection != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        if (robotXCoordinate > toX) {
            while (robotCurrentDirection != Direction.LEFT) {
                robot.turnRight();
            }
        }

        while (robotXCoordinate != toX) {
            robot.stepForward();
        }

        int robotYCoordinate = robot.getY();

        if (robotYCoordinate < toY) {
            while (robotCurrentDirection != Direction.UP) {
                robot.turnRight();
            }
        }

        if (robotYCoordinate > toY) {
            while (robotCurrentDirection != Direction.DOWN) {
                robot.turnRight();
            }
        }

        while (robotYCoordinate != toY) {
            robot.stepForward();
        }
    }
}

