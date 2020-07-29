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
        robotMoveX(robot, toX);
        robotMoveY(robot, toY);
    }

    private void robotRotate(Robot robot, Direction direction) {
        while (!robot.getDirection().equals(direction)) {
            robot.turnRight();
        }
    }

    private void robotMoveX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            robotRotate(robot, Direction.RIGHT);
        } else {
            robotRotate(robot, Direction.LEFT);
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void robotMoveY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            robotRotate(robot, Direction.UP);
        } else {
            robotRotate(robot, Direction.DOWN);
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
