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
        //your code
        int stepsX = toX - robot.getX();
        int stepsY = toY - robot.getY();
        if (stepsX > 0) {
            moveRight(robot, stepsX);
        } else if (stepsX < 0) {
            moveLeft(robot, stepsX);
        }
        if (stepsY > 0) {
            moveUp(robot, stepsY);
        } else if (stepsY < 0) {
            moveDown(robot, stepsY);
        }
    }

    public void moveRight(Robot robot, int x) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
        for (int i = 0; i < x; i++) {
            robot.stepForward();
        }
    }

    public void moveLeft(Robot robot, int x) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnRight();
        }
        for (int i = 0; i > x; i--) {
            robot.stepForward();
        }
    }

    public void moveUp(Robot robot, int y) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        for (int i = 0; i < y; i++) {
            robot.stepForward();
        }
    }

    public void moveDown(Robot robot, int y) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
        }
        for (int i = 0; i > y; i--) {
            robot.stepForward();
        }
    }
}

