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
            switch (robot.getDirection()) {
                case UP:
                case DOWN:
                    turn(robot, toX, robot.getX());
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    // fall through
                case LEFT:
                case RIGHT:
                    turn(robot, toY, robot.getY());
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    // fall through
                default:
            }
        }
    }

    private void turn(Robot robot, int destination, int currentPosition) {

        if ((robot.getDirection() == Direction.UP
                || robot.getDirection() == Direction.LEFT) && destination >= currentPosition
                || (robot.getDirection() == Direction.DOWN
                || robot.getDirection() == Direction.RIGHT) && destination <= currentPosition) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
    }

}

