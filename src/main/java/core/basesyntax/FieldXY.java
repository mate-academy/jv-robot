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
    public void goToDirection(Robot robot, long i, Direction whereRobotHaveToLook) {
        changeDirection(robot, whereRobotHaveToLook);
        while (i > 0) {
            robot.stepForward();
            i--;
        }
    }

    public void changeDirection(Robot robot, Direction whereRobotHaveToLook) {
        while (robot.getDirection() != whereRobotHaveToLook) {
            robot.turnLeft();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() > toX) {
            goToDirection(robot, (long) robot.getX() - (long) toX, Direction.LEFT);
        } else if (robot.getX() < toX) {
            goToDirection(robot, (long) toX - (long) robot.getX(), Direction.RIGHT);
        }
        if (robot.getY() > toY) {
            goToDirection(robot, (long) robot.getY() - (long) toY, Direction.DOWN);
        } else if (robot.getY() < toY) {
            goToDirection(robot, (long) toY - (long) robot.getY(), Direction.UP);
        }
    }
}
