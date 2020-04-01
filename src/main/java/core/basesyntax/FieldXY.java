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
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() != toX) {
                if (robot.getX() > toX) {
                    turnRobot(robot, Direction.LEFT);
                    multiplySteps(robot, robot.getX() - toX);
                } else {
                    turnRobot(robot, Direction.RIGHT);
                    multiplySteps(robot, toX - robot.getX());
                }
            }
            if (robot.getY() != toY) {
                if (robot.getY() > toY) {
                    turnRobot(robot, Direction.DOWN);
                    multiplySteps(robot, robot.getY() - toY);
                } else {
                    turnRobot(robot, Direction.UP);
                    multiplySteps(robot, toY - robot.getY());
                }
            }
        }
    }

    public void turnRobot(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }

    public void multiplySteps(Robot robot, int steps) {
        while (steps != 0) {
            robot.stepForward();
            steps--;
        }
    }
}

