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
        while ((robot.getX() != toX) || (robot.getY() != toY)) {
            goToX(robot,toX);
            goToY(robot,toY);
        }
    }

    public static void goToX(Robot robot, int newX) {
        if (robot.getX() < newX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        if (robot.getX() > newX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
        while (robot.getX() != newX) {
            robot.stepForward();
        }
    }

    public static void goToY(Robot robot, int newY) {
        if (robot.getY() < newY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        if (robot.getY() > newY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while (robot.getY() != newY) {
            robot.stepForward();
        }
    }
}

