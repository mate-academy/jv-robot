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
        int startX = robot.getX();
        int startY = robot.getY();
        while (startX != toX && startY != toY) {
            Direction direction = robot.getDirection();
            if (toY - startY > 0) {
                if (direction == Direction.UP) {
                    robot.stepForward();
                    startY = robot.getY();
                } else {
                    direction = Direction.UP;
                    robot.stepForward();
                    startY = robot.getY();
                }
            }
            if (toX - startX > 0) {
                if (direction == Direction.RIGHT) {
                    robot.stepForward();
                    startX = robot.getX();
                } else {
                    direction = Direction.RIGHT;
                    robot.stepForward();
                    startX = robot.getX();
                }
            }
            if (startX - toX > 0) {
                if (direction == Direction.LEFT) {
                    robot.stepForward();
                    startX = robot.getX();
                } else {
                    direction = Direction.LEFT;
                    robot.stepForward();
                    startX = robot.getX();
                }
            }
            if (startY - toY > 0) {
                if (direction == Direction.DOWN) {
                    robot.stepForward();
                    startY = robot.getY();
                } else {
                    direction = Direction.DOWN;
                    robot.stepForward();
                    startY = robot.getY();
                }
            }
        }
    }
}

