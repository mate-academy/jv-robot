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
        Direction directionX = chooseDirectionForX(toX);
        moveToX(robot, toX, directionX);
        Direction directionY = chooseDirectionForY(toY);
        moveToY(robot, toY, directionY);
    }

    public static Direction chooseDirectionForY(int toY) {
        return toY > 0
                ? Direction.UP : Direction.DOWN;
    }

    public static Direction chooseDirectionForX(int toX) {
        return toX > 0
                ? Direction.RIGHT : Direction.LEFT;
    }

    public static void moveToX(Robot robot, int toX, Direction directionX) {
        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public static void moveToY(Robot robot, int toY, Direction directionY) {
        while (robot.getDirection() != directionY) {
            robot.turnRight();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

