package core.basesyntax;

//import java.security.UnresolvedPermission;

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
        int x = toX - robot.getX();
        int y = toY - robot.getY();
        if (x != 0) {
            if (x > 0) {
                moveRight(robot, x);
            } else {
                moveLeft(robot, x);
            }
        }
        if (y != 0) {
            if (y > 0) {
                moveUp(robot, y);
            } else {
                moveDown(robot, y);
            }
        }
    }

    public void moveRight(Robot robot, int x) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case RIGHT:
                break;
            default:
        }
        for (int i = 0; i < x; i++) {
            robot.stepForward();
        }
    }

    public void moveLeft(Robot robot, int x) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnRight();
                break;
            case LEFT:
                break;
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
        }
        for (int i = 0; i > x; i--) {
            robot.stepForward();
        }
    }

    public void moveUp(Robot robot, int y) {
        switch (robot.getDirection()) {
            case UP:
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnRight();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            default:
        }
        for (int i = 0; i < y; i++) {
            robot.stepForward();
        }
    }

    public void moveDown(Robot robot, int y) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case DOWN:
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
        }
        for (int i = 0; i > y; i--) {
            robot.stepForward();
        }
    }
}

