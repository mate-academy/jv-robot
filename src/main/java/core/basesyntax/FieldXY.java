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
        Direction directionX = chooseDirection(toX, "X");
        move(robot, toX, toY, directionX);
        Direction directionY = chooseDirection(toY, "Y");
        move(robot, toX, toY, directionY);
    }

    public static Direction chooseDirection(int to, String axes) {
        if (axes == "X") {
            return to > 0
                    ? Direction.RIGHT : Direction.LEFT;
        } else {
            return to > 0
                    ? Direction.UP : Direction.DOWN;
        }
    }

    public static void move(Robot robot, int toX, int toY, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
        switch (direction) {
            case UP:
            case DOWN: while (robot.getY() != toY) {
                    robot.stepForward();
                }
                break;
            case LEFT:
            case RIGHT: while (robot.getX() != toX) {
                    robot.stepForward();
                }
                break;
            default:
                break;
        }
    }
}

