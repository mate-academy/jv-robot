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
        Direction[] trueDirection = trueDirection(robot, toX, toY);

        if (robot.getDirection() != trueDirection[0]
                || robot.getDirection() != trueDirection[1]) {
            turnToNeededDirection(robot, trueDirection);
        }
        goToEndOfDirection(robot, toX, toY);
        turnToNeededDirection(robot, trueDirection);
        goToEndOfDirection(robot, toX, toY);
    }

    private Direction[] trueDirection(Robot robot, int toX, int toY) {
        return new Direction[] {(toX > robot.getX()) ? Direction.RIGHT : Direction.LEFT,
                                (toY > robot.getY()) ? Direction.UP : Direction.DOWN};
    }

    private void turnToNeededDirection(Robot robot, Direction[] trueDirection) {
        switch (robot.getDirection()) {
            case UP:
                if (trueDirection[0] == Direction.RIGHT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (trueDirection[0] == Direction.LEFT) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (trueDirection[1] == Direction.UP) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            case RIGHT:
                if (trueDirection[1] == Direction.DOWN) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
    }

    private void goToEndOfDirection(Robot robot, int toX, int toY) {
        switch (robot.getDirection()) {
            case LEFT:
            case RIGHT:
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
                break;
            case DOWN:
            case UP:
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
                break;
            default: break;
        }
    }

}

