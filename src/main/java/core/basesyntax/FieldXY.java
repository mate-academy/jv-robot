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

        long distanceToX = Math.abs(robot.getX() - (long) toX);
        long distanceToY = Math.abs(robot.getY() - (long) toY);

        if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

            for (long i = 0; i < distanceToX; i++) {
                robot.stepForward();
            }
        }

        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case LEFT:
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

            for (long i = 0; i < distanceToX; i++) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case UP:
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

            for (long i = 0; i < distanceToY; i++) {
                robot.stepForward();
            }
        }

        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }

            for (long i = 0; i < distanceToY; i++) {
                robot.stepForward();
            }
        }
    }
}

