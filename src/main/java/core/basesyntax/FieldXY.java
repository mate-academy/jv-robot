package core.basesyntax;

import static core.basesyntax.Direction.DOWN;

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
        turnToNeededPosition(robot, toY, "Y");
        moveRobotToPoint(robot, toY, "Y");
        turnToNeededPosition(robot, toY, "X");
        moveRobotToPoint(robot, toX, "X");
    }

    public void turnToNeededPosition(Robot robot, int poinTo, String marker) {
        if (marker == "Y") {
            if (robot.getY() <= poinTo) {
                turnRobot(robot, Direction.UP);
            } else if (robot.getY() >= poinTo) {
                turnRobot(robot, DOWN);
            }
        } else if (marker == "X") {
            if (robot.getX() <= poinTo) {
                turnRobot(robot, Direction.LEFT);
            } else if (robot.getX() >= poinTo) {
                turnRobot(robot, Direction.RIGHT);
            }
        }
    }

    public void turnRobot(Robot robot, Direction neededDirection) {
        while (robot.getDirection() != neededDirection) {
            robot.turnRight();
        }
    }

    public void moveRobotToPoint(Robot robot, int neededPosition, String marker) {
        if (marker == "X") {
            while (robot.getX() != neededPosition) {
                robot.stepForward();
            }
        } else if (marker == "Y") {
            while (robot.getY() != neededPosition) {
                robot.stepForward();
            }
        }
    }
}






























