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
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX) {
                setNeededDirection(robot, robot.getX() < toX ? Direction.RIGHT : Direction.LEFT);
                robot.stepForward();
                continue;
            }
            setNeededDirection(robot, robot.getY() < toY ? Direction.UP : Direction.DOWN);
            robot.stepForward();
        }
    }

    private void setNeededDirection(Robot robot, Direction neededDirection) {
        while (!robot.getDirection().equals(neededDirection)) {
            robot.turnLeft();
        }
    }
}

