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
        //        int startX = 1;
        //        int startY = 1;
        //        Robot robot = new Robot(Direction.LEFT, startX, startY);
        //        int finalX = 7;
        //        int finalY = -3;
        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                if (robot.getDirection() == Direction.UP) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                if (robot.getDirection() == Direction.DOWN) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        } else {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}

