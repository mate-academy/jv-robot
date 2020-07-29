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

        if (toX < robot.getX()){
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() >= toX) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
            while (robot.getX() <= toX) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
            while (robot.getY() >= toY) {
                robot.stepForward();
            }
        } else if (toY > robot.getY()) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnRight();
            }
            while (robot.getY() <= toY) {
                robot.stepForward();
            }
        }

    }
}

