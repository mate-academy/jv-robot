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
        int xoffset = toX - robot.getX();
        int yoffset = toY - robot.getY();
        if (xoffset > 0) {
            moveRight(robot, xoffset);
        } else {
            moveLeft(robot, xoffset);
        }
        if (yoffset > 0) {
            moveUp(robot, yoffset);
        } else {
            moveDown(robot, yoffset);
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
            default:
                break;
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
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            default:
                break;
        }
        for (int i = 0; i > x; i--) {
            robot.stepForward();
        }
    }

    public void moveUp(Robot robot, int y) {
        switch (robot.getDirection()) {
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
                break;
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
            case LEFT:
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnRight();
                break;
            default:
                break;
        }
        for (int i = 0; i > y; i--) {
            robot.stepForward();
        }
    }
}

