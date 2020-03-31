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
        //set  position up ;
        if (robot.getDirection() == Direction.LEFT) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.RIGHT) {
            robot.turnLeft();
        } else if(robot.getDirection() == Direction.DOWN) {
            robot.turnLeft();
            robot.turnLeft();
        }

        //move x
        if (robot.getX() < toX) {
            robot.turnRight();
            while(robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            robot.turnLeft();
            while(robot.getX() != toX) {
                robot.stepForward();
            }
        }

        //move y
        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            } else if(robot.getDirection() == Direction.RIGHT){
                robot.turnLeft();
            }
            while(robot.getY() != toY) {
                robot.stepForward();
            }
        }else if (toY < robot.getY()) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                robot.turnRight();
            }
            while(robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}

