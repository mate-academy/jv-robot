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
public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {

            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.RIGHT);

        } else {

            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.LEFT);
        }

        do {
            robot.stepForward();
        } while (robot.getX() != toX);

        if (robot.getY() < toY) {

            do {
                robot.turnRight();
            } while (robot.getDirection() != Direction.UP);

        } else {

            do {
                robot.turnLeft();
            } while (robot.getDirection() != Direction.DOWN);
        }

        do {
            robot.stepForward();
        } while (robot.getY() != toY);
    }
}

