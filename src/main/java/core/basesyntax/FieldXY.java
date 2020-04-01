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
            goToEnd(robot, toX, toY);
        }

    }

    private Direction[] trueDirection(Robot robot, int toX, int toY) {
        return new Direction[] {(toX > robot.getX()) ? Direction.RIGHT : Direction.LEFT,
                                (toY > robot.getY()) ? Direction.UP : Direction.DOWN};
    }

    private void turnToNeededDirection(Robot robot, int toX, int toY) {
        Direction[] neededDirection = trueDirection(robot, toX, toY);
        switch (robot.getDirection()) {
            case UP:
                if (neededDirection[0].equals(Direction.RIGHT)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (neededDirection[0].equals(Direction.LEFT)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (neededDirection[1].equals(Direction.UP)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (neededDirection[1].equals(Direction.DOWN)) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
    }

    private void goToEnd(Robot robot, int toX, int toY) {
        turnToNeededDirection(robot, toX, toY);
        if (robot.getDirection().equals(Direction.LEFT)
                || robot.getDirection().equals(Direction.RIGHT)) {
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }

}

