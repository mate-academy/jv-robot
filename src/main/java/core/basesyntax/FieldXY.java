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
        // Move worward to destination toX
        if (robot.getX() != toX) {
            // Turn robot into right direction
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }

            do {
                robot.stepForward();
            } while (robot.getX() != toX);
        }

        // Move worward to destination toY
        if (robot.getY() != toY) {
            // Turn robot into right direction
            if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                }
            }

            do {
                robot.stepForward();
            } while (robot.getY() != toY);
        }
    }
}

