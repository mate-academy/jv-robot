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
        if (toX != robot.getX()) {
            if (toX > robot.getX()) {
                lookRight(robot);
            }
            if (toX < robot.getX()) {
                lookRLeft(robot);
            }
            long x0 = robot.getX();
            for (long i = 0; i < Math.abs(toX - x0); i++) {
                robot.stepForward();
            }
        }
        if (toY != robot.getY()) {
            if (toY > robot.getY()) {
                lookUp(robot);
            }
            if (toY < robot.getY()) {
                lookDown(robot);
            }
            long y0 = robot.getY();
            for (long i = 0; i < Math.abs(toY - y0); i++) {
                robot.stepForward();
            }
        }
    }

    private static void lookRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnRight();
                break;
            case LEFT:
                robot.turnRight();
                robot.turnRight();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            default:
                break;
        }

    }

    private static void lookRLeft(Robot robot) {
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

    }

    private static void lookUp(Robot robot) {
        switch (robot.getDirection()) {
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

    }

    private static void lookDown(Robot robot) {
        switch (robot.getDirection()) {
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

    }

}

