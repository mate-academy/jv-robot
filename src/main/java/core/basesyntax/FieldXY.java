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
        Direction direction = robot.getDirection();
        switch (direction) {
            case UP:
                upDirection(robot, toX, toY);
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                upDirection(robot, toX, toY);
                break;
            case RIGHT:
                robot.turnLeft();
                upDirection(robot, toX, toY);
                break;
            case LEFT:
                robot.turnRight();
                upDirection(robot, toX, toY);
                break;
            default:
                break;
        }
    }

    public static void upDirection(Robot robot, int toX, int toY) {
        if (robot.getY() < toY) {
            while (toY != robot.getY()) {
                robot.stepForward();
            }
            if (robot.getX() < toX) {
                robot.turnRight();
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else {
                robot.turnLeft();
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            }
        } else {
            robot.turnRight();
            robot.turnRight();
            while (toY != robot.getY()) {
                robot.stepForward();
            }

            if (robot.getX() < toX) {
                robot.turnLeft();
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            } else {
                robot.turnRight();
                while (toX != robot.getX()) {
                    robot.stepForward();
                }
            }
        }
    }
}

