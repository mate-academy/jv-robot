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
                if (robot.getDirection() != Direction.LEFT) {
                    if ((robot.getDirection() == Direction.UP || robot.getDirection()
                            == Direction.RIGHT)) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                } else {
                    robot.stepForward();
                }
                continue;
            }
            if (robot.getDirection() != Direction.RIGHT) {
                if ((robot.getDirection() == Direction.UP || robot.getDirection()
                        == Direction.LEFT)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            } else {
                robot.stepForward();
            }
        }

        while (robot.getY() != toY) {
            if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    if ((robot.getDirection() == Direction.LEFT && robot.getDirection()
                            == Direction.UP)) {
                        robot.turnLeft();
                    } else {
                        robot.turnRight();
                    }
                } else {
                    robot.stepForward();
                }
                continue;
            }
            if (robot.getDirection() != Direction.UP) {
                if ((robot.getDirection() == Direction.DOWN && robot.getDirection()
                        == Direction.LEFT)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            } else {
                robot.stepForward();
            }
        }
    }
}

