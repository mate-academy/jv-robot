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
        int startX = robot.getX();
        int startY = robot.getY();
        while (startX != toX && startY != toY) {
            if (robot.getDirection() == Direction.UP) {
                if (toY - startY > 0) {
                    robot.stepForward();
                    startY = robot.getY();
                }
                if (startX - toX > 0) {
                    robot.turnLeft();
                }
                if (toX - startX > 0) {
                    robot.turnRight();
                }
                if (startY - toY > 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
            }
            if (robot.getDirection() == Direction.RIGHT) {
                if (toX - startX > 0) {
                    robot.stepForward();
                    startX = robot.getX();
                }
                if (toY - startY > 0) {
                    robot.turnLeft();
                }
                if (startY - toY > 0) {
                    robot.turnRight();
                }
                if (startX - toX > 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
            }
            if (robot.getDirection() == Direction.DOWN) {
                if (startY - toY > 0) {
                    robot.stepForward();
                    startY = robot.getY();
                }
                if (toX - startX > 0) {
                    robot.turnLeft();
                }
                if (startX - toX > 0) {
                    robot.turnRight();
                }
                if (toY - startY > 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
            }
            if (robot.getDirection() == Direction.LEFT) {
                if (startX - toX > 0) {
                    robot.stepForward();
                    startX = robot.getY();
                }
                if (startY - toY > 0) {
                    robot.turnLeft();
                }
                if (toY - startY > 0) {
                    robot.turnRight();
                }
                if (toX - startX > 0) {
                    robot.turnRight();
                    robot.turnRight();
                }
            }
        }
    }
}

