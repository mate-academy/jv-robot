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
        chooseYDirection(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }

        chooseXDirection(robot, toX);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void chooseYDirection(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        } else if (robot.getY() < toY) {
            while (!robot.getDirection().equals(Direction.UP)) {
                robot.turnLeft();
            }
        }
    }

    private void chooseXDirection(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else if (robot.getX() < toX) {
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
        }
    }
}
