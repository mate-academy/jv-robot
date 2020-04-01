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
                setNeededDirection(robot, robot.getX() < toX ? Direction.RIGHT : Direction.LEFT);
                robot.stepForward();
                continue;
            }
            setNeededDirection(robot, robot.getY() < toY ? Direction.UP : Direction.DOWN);
            robot.stepForward();
        }
    }

    private void setNeededDirection(Robot robot, Direction neededDirection) {
        if (robot.getDirection().equals(neededDirection)) {
            return;
        }
        switch (robot.getDirection()) {
            case UP:
                if (neededDirection.equals(Direction.LEFT)) {
                    robot.turnLeft();
                } else if (neededDirection.equals(Direction.RIGHT)) {
                    robot.turnRight();
                } else {
                    turnAround(robot);
                }
                break;
            case DOWN:
                if (neededDirection.equals(Direction.LEFT)) {
                    robot.turnRight();
                } else if (neededDirection.equals(Direction.RIGHT)) {
                    robot.turnLeft();
                } else {
                    turnAround(robot);
                }
                break;
            case LEFT:
                if (neededDirection.equals(Direction.UP)) {
                    robot.turnRight();
                } else if (neededDirection.equals(Direction.DOWN)) {
                    robot.turnLeft();
                } else {
                    turnAround(robot);
                }
                break;
            case RIGHT:
                if (neededDirection.equals(Direction.UP)) {
                    robot.turnLeft();
                } else if (neededDirection.equals(Direction.DOWN)) {
                    robot.turnRight();
                } else {
                    turnAround(robot);
                }
                break;
            default:
                break;
        }
    }

    private void turnAround(Robot robot) {
        robot.turnLeft();
        robot.turnLeft();
    }
}

