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
        turnRobotToTarget(robot, robot.getX(), toX, Direction.RIGHT, Direction.LEFT);
        moveRobotToTarget(robot,robot.getX(), toX);
        turnRobotToTarget(robot, robot.getY(), toY, Direction.UP, Direction.DOWN);
        moveRobotToTarget(robot,robot.getY(), toY);
    }

    public void turnRobotToTarget(Robot robot, int position, int target,
                                  Direction direction1, Direction direction2) {
        if (position < target) {
            while (robot.getDirection() != direction1) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != direction2) {
                robot.turnLeft();
            }
        }
    }

    public void moveRobotToTarget(Robot robot, int position, int target) {
        while (position != target) {
            robot.stepForward();
            position = getPosition(robot);
        }
    }

    public int getPosition(Robot robot) {
        if (robot.getDirection() == Direction.LEFT || robot.getDirection() == Direction.RIGHT) {
            return robot.getX();
        }
        return robot.getY();
    }
}

