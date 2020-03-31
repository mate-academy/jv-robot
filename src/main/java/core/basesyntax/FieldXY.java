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
        calibrateX(robot, toX < robot.getX() ? Direction.LEFT : Direction.RIGHT);
        steps(robot, (long) toX - (long) robot.getX());
        calibrateY(robot, toY < robot.getY() ? Direction.DOWN : Direction.UP);
        steps(robot, (long) toY - (long) robot.getY());
    }

    public void calibrateX(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    public void calibrateY(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    public void steps(Robot robot, long pathLength) {
        if (pathLength < 0) {
            pathLength *= -1;
        }
        while (pathLength != 0) {
            robot.stepForward();
            pathLength--;
        }
    }
}

