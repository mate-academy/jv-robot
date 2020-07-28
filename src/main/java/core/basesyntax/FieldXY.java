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
        int i = 0;
        int j = 0;
        int x = 0;
        int y = 0;

        x = toX - robot.getX();
        y = toY - robot.getY();

        if (x > 0 && robot.getDirection() == Direction.UP) {
            robot.turnRight();
            while (i < x) {
                robot.stepForward();
                i++;
            }
        }
        if (x > 0 && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            robot.turnRight();
            while (i < x) {
                robot.stepForward();
                i++;
            }
        }
        if (x > 0 && robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            while (i < x) {
                robot.stepForward();
                i++;
            }
        }
        if (x > 0 && robot.getDirection() == Direction.RIGHT) {
            while (i < x) {
                robot.stepForward();
                i++;
            }
        }

        if (x < 0 && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            while (i > x) {
                robot.stepForward();
                i--;
            }
        }
        if (x < 0 && robot.getDirection() == Direction.LEFT) {
            while (i > x) {
                robot.stepForward();
                i--;
            }
        }
        if (x < 0 && robot.getDirection() == Direction.DOWN) {
            robot.turnRight();
            while (i > x) {
                robot.stepForward();
                i--;
            }
        }
        if (x < 0 && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            robot.turnRight();
            while (i > x) {
                robot.stepForward();
                i--;
            }
        }

        //         часть для Y

        if (y > 0 && robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
            while (j < y) {
                robot.stepForward();
                j++;
            }
        }
        if (y > 0 && robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
            while (j < y) {
                robot.stepForward();
                j++;
            }
        }
        if (y > 0 && robot.getDirection() == Direction.UP) {
            while (j < y) {
                robot.stepForward();
                j++;
            }
        }
        if (y > 0 && robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            robot.turnLeft();
            while (j < y) {
                robot.stepForward();
                j++;
            }
        }

        //         часть для Y minus
        if (y < 0 && robot.getDirection() == Direction.LEFT) {
            robot.turnLeft();
            while (j > y) {
                robot.stepForward();
                j--;
            }
        }

        if (y < 0 && robot.getDirection() == Direction.RIGHT) {
            robot.turnRight();
            while (j > y) {
                robot.stepForward();
                j--;
            }
        }
        if (y < 0 && robot.getDirection() == Direction.UP) {
            robot.turnLeft();
            robot.turnLeft();
            while (j > y) {
                robot.stepForward();
                j--;
            }
        }
        if (y < 0 && robot.getDirection() == Direction.DOWN) {
            while (j > y) {
                robot.stepForward();
                j--;
            }
        }
    }
}
