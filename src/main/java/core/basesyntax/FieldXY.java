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
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case UP: robot.turnRight();
                break;
                case LEFT: robot.turnRight();
                           robot.turnRight();
                break;
                case DOWN: robot.turnLeft();
                break;
                default: break;
            }
        } else if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case RIGHT: robot.turnLeft();
                            robot.turnLeft();
                    break;
                case DOWN: robot.turnRight();
                    break;
                case UP: robot.turnLeft();
                    break;
                default: break;
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case LEFT: robot.turnRight();
                break;
                case DOWN: robot.turnRight();
                           robot.turnRight();
                break;
                case RIGHT: robot.turnLeft();
                break;
                default: break;
            }
        } else if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case RIGHT: robot.turnRight();
                break;
                case LEFT: robot.turnLeft();
                break;
                case UP: robot.turnLeft();
                         robot.turnLeft();
                break;
                default: break;
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

