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
        
        if (toX < robot.getX()) {
            while (Direction.LEFT != robot.getDirection()) {
                robot.turnLeft();
            }
        } else {
            while (Direction.RIGHT != robot.getDirection()) {
                robot.turnRight();
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            while (Direction.DOWN != robot.getDirection()) {
                robot.turnRight();
            }
        } else {
            while (Direction.UP  != robot.getDirection()) {
                robot.turnLeft();
            }
        }
        while (toY !=  robot.getY()) {
            robot.stepForward();
        }
    }
}
