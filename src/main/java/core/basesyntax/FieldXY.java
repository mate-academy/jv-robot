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
    private void coordinateDirection(Robot robot, int distance, Direction one, Direction two) {
        if (distance < 0) {
            while (robot.getDirection() != one) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != two) {
                robot.turnRight();
            }
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        int distanceX = toX - robot.getX();
        while (robot.getX() != toX) {
            coordinateDirection(robot, distanceX, Direction.LEFT, Direction.RIGHT);
            robot.stepForward();
        }
        int distanceY = toY - robot.getY();
        while (robot.getY() != toY) {
            coordinateDirection(robot, distanceY, Direction.DOWN, Direction.UP);
            robot.stepForward();
        }
    }
}

