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
        while (robot.getX() != toX) {
            if (robot.getX() > toX) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    default:
                        robot.stepForward();
                }
            } else {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    default:
                        robot.stepForward();
                }
            }
        }
        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    default:
                        robot.stepForward();
                }
            } else {
                switch (robot.getDirection()) {
                    case DOWN:
                        robot.turnRight();
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        robot.stepForward();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.stepForward();
                        break;
                    default:
                        robot.stepForward();
                }
            }
        }
    }
}

