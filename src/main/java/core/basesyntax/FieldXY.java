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

        int actualY = robot.getY();
        Direction actualDirection = robot.getDirection();

        if (toX < robot.getX()) {
            switch (actualDirection) {
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
            for (int i = robot.getX(); i >= toX; i--) {
                robot.stepForward();
            }
        } else if (toX > robot.getX()) {
            switch (actualDirection) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
            for (int i = robot.getX(); i <= toX; i++) {
                robot.stepForward();
            }
        }

        if (toY < actualY) {
            switch (actualDirection) {
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
            for (int i = robot.getY(); i >= toX; i--) {
                robot.stepForward();
            }
        } else if (toY > actualY) {
            switch (actualDirection) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
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
            for (int i = robot.getX(); i <= toX; i++) {
                robot.stepForward();
            }
        }
    }
}

