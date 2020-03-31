package core.basesyntax;

import static core.basesyntax.Direction.*;

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
        if (robot.getY() < toY) {
            while (!robot.getDirection().equals(UP)) {
                robot.turnRight();
            }
            while (robot.getY() < toY){
                robot.stepForward();
            }
        }
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() > toY){
                robot.stepForward();
            }
        }
        if (robot.getX() < toX) {
            while (!robot.getDirection().equals(RIGHT)) {
                robot.turnRight();
            }
            while (robot.getX() < toX){
                robot.stepForward();
            }
        }
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() > toX){
                robot.stepForward();
            }
        }
    }
}