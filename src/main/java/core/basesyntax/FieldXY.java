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
        Direction directionToX = null;
        Direction directionToY = null;

        if (robot.getX() > toX) {
            directionToX = Direction.LEFT;
        } else if (robot.getX() < toX) {
            directionToX = Direction.RIGHT;
        }

        if (robot.getY() > toY) {
            directionToY = Direction.DOWN;
        } else if (robot.getY() < toY) {
            directionToY = Direction.UP;
        }
        if (robot.getX() != toX | robot.getY() != toY) {
            while (!(robot.getDirection().equals(directionToX)) & robot.getX() != toX) {
                switch (directionToX) {
                    case RIGHT:
                        switch (robot.getDirection()) {
                            case UP:
                                robot.turnRight();
                                break;
                            case DOWN:
                            case LEFT:
                                robot.turnLeft();
                                break;
                            default:
                                break;
                        }
                        break;
                    case LEFT:
                        switch (robot.getDirection()) {
                            case UP:
                                robot.turnLeft();
                                break;
                            case DOWN:
                            case RIGHT:
                                robot.turnRight();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }

            if (robot.getDirection().equals(directionToX)) {
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            }

            while (!(robot.getDirection().equals(directionToY)) & robot.getY() != toY) {
                switch (directionToY) {
                    case UP:
                        switch (robot.getDirection()) {
                            case LEFT:
                                robot.turnRight();
                                break;
                            case RIGHT:
                                robot.turnLeft();
                                break;
                            default:
                                break;
                        }
                        break;
                    case DOWN:
                        switch (robot.getDirection()) {
                            case LEFT:
                                robot.turnLeft();
                                break;
                            case RIGHT:
                                robot.turnRight();
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        robot.turnLeft();
                        break;
                }
            }

            if (robot.getDirection().equals(directionToY)) {
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }

    }
}

