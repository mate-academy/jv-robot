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
        Direction targetDirectionX = robot.getDirection();
        if (toX > robot.getX()) {
            targetDirectionX = Direction.RIGHT;
        } else if (toX < robot.getX()) {
            targetDirectionX = Direction.LEFT;
        }

        while (robot.getDirection() != targetDirectionX) {
            robot.turnRight();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }

        Direction targetDirectionY = robot.getDirection();
        if (toY > robot.getY()) {
            targetDirectionY = Direction.UP;
        } else if (toY < robot.getY()) {
            targetDirectionY = Direction.DOWN;
        }

        while (robot.getDirection() != targetDirectionY) {
            robot.turnRight();
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

