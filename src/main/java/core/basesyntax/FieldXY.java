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
        if (robot.getX() != toX) {
            moveRobotForX(robot, toX);
        }
        if (robot.getY() != toY) {
            moveRobotForY(robot, toY);
        }
    }

    private void moveRobotForY(Robot robot, int toY) {
        if (robot.getY() < toY) {
            turnRobot(robot, Direction.UP);
        } else {
            turnRobot(robot, Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    private void moveRobotForX(Robot robot, int toX) {
        if (robot.getX() < toX) {
            turnRobot(robot, Direction.RIGHT);
        } else {
            turnRobot(robot, Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
    }

    private void turnRobot(Robot robot, Direction direction) {
        if (direction.equals(Direction.RIGHT)) {
            turnRobotRight(robot);
        } else if (direction.equals(Direction.LEFT)) {
            turnRobotLeft(robot);
        } else if (direction.equals(Direction.UP)) {
            turnRobotUp(robot);
        } else {
            turnRobotDown(robot);
        }
    }

    private void turnRobotRight(Robot robot) {
        if (robot.getDirection().equals(Direction.UP)) {
            robot.turnRight();
        } else if (robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void turnRobotLeft(Robot robot) {
        if (robot.getDirection().equals(Direction.UP)) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.DOWN)) {
            robot.turnRight();
        } else if (robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void turnRobotUp(Robot robot) {
        if (robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.LEFT)) {
            robot.turnRight();
        } else if (robot.getDirection().equals(Direction.DOWN)) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void turnRobotDown(Robot robot) {
        if (robot.getDirection().equals(Direction.RIGHT)) {
            robot.turnRight();
        } else if (robot.getDirection().equals(Direction.LEFT)) {
            robot.turnLeft();
        } else if (robot.getDirection().equals(Direction.UP)) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

}

