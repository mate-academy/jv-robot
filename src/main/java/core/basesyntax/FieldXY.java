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

    public void rotateRobot(Robot robot, Direction direction) {
        while (direction != robot.getDirection()) {
            robot.turnLeft();
        }
        System.out.println("Now looking " + robot.getDirection());
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Going to X:" + toX + ", Y:" + toY + " Look " + robot.getDirection());
        rotateRobot(robot, (robot.getX() - toX) > 0 ? Direction.LEFT : Direction.RIGHT);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        System.out.println("I`m at X:" + robot.getX() + " Y:" + robot.getY());
        rotateRobot(robot, (robot.getY() - toY) > 0 ? Direction.DOWN : Direction.UP);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        System.out.println("I`m at X:" + robot.getX() + " Y:" + robot.getY());
    }
}
