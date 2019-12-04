package core.basesyntax;

import static core.basesyntax.Direction.DOWN;

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
        //your code
        if (robot.getY() <= toY) {
            switch (robot.getDirection()) {
                case UP:
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                    }
                    break;
                case DOWN:
                    if (robot.getX() > toX) {
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                    }
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() >= toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() <= toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    robot.turnLeft();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() >= toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() <= toX) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;
            }
        }
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP:
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                        while (robot.getX() != toX) {
                            robot.stepForward();
                        }
                        robot.turnRight();
                    }
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case DOWN:
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnRight();
                    }
                    if (robot.getX() < toX) {
                        robot.turnLeft();
                    }
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    break;
                case LEFT:
                    robot.turnRight();
                    while (robot.getY() != toY) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                    }
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    break;
                case RIGHT:
                    robot.turnRight();
                    while (robot.getX() != toX) {
                        robot.stepForward();
                    }
                    if (robot.getX() > toX) {
                        robot.turnLeft();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                    }
                    if (robot.getX() < toX) {
                        robot.turnRight();
                        while (robot.getY() != toY) {
                            robot.stepForward();
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}





























