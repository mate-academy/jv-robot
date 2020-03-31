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
        if (robot.getX() != toX) {
            setDirectionToX(robot, toX);
            moveToX(robot, toX);
        }
        if (robot.getY() != toY) {
            setDirectionToY(robot, toY);
            moveToY(robot, toY);
        }
    }

    public void setDirectionToX(Robot robot, int toX) {
        if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    public void setDirectionToY(Robot robot, int toY) {
        if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
        }
    }

    public void moveToX(Robot robot, int toX) {
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    public void moveToY(Robot robot, int toY) {
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}

