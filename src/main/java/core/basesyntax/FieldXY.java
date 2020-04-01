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
        if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
        }
        turnAndMove(robot, toX, robot.getX(), 'x');
        turnAndMove(robot, toY, robot.getY(), 'y');
    }

    private void turnAndMove(Robot robot, int destination, int currentPosition, char line) {

        if ((robot.getDirection() == Direction.UP
                || robot.getDirection() == Direction.LEFT) && destination >= currentPosition
                || (robot.getDirection() == Direction.DOWN
                || robot.getDirection() == Direction.RIGHT) && destination <= currentPosition) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }

        while (currentPosition != destination) {
            robot.stepForward();
            currentPosition = line == 'x' ? robot.getX() : robot.getY();
        }
    }

}

