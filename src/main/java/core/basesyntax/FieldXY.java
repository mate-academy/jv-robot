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
            moveHorizontal(robot, toX);
        }
        while (robot.getY() != toY) {
            moveVertical(robot, toY);
        }
    }

    private void moveHorizontal(Robot robot, int toX) {
        if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case LEFT:
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                default:
                    robot.stepForward();
                    break;
            }
        }
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case RIGHT:
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                default:
                    robot.stepForward();
                    break;
            }
        }
    }

    private void moveVertical(Robot robot, int toY) {
        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                case LEFT:
                    robot.turnRight();
                    break;
                default:
                    robot.stepForward();
                    break;
            }
        }
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case UP:
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    robot.stepForward();
                    break;
            }
        }
    }
}

