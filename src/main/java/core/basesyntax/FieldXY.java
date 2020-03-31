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
        moveX(robot, toX);
        moveY(robot, toY);
    }

    private void moveX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                case RIGHT:
                    if (robot.getX() > toX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            robot.stepForward();
        }
    }

    private void moveY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getY() > toY) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (robot.getY() < toY) {
                        robot.turnLeft();
                        robot.turnLeft();
                    }
                    break;
                case LEFT:
                    if (robot.getY() > toY) {
                        robot.turnRight();
                    } else {
                        robot.turnLeft();
                    }
                    break;
                case RIGHT:
                    if (robot.getY() < toY) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
            robot.stepForward();
        }
    }
}

