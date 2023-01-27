package core.basesyntax;

import org.jetbrains.annotations.NotNull;

import static core.basesyntax.Direction.*;

public class RobotRoute {

    public void moveRobot(@NotNull Robot robot, int toX, int toY) {
        //write your solution here
        Direction direction = robot.getDirection();
        int coordinateX = robot.getX();
        int coordinateY = robot.getY();
        if (direction == UP && coordinateX < toX) {
            robot.turnRight();
//            direction = RIGHT;
        }
        if (direction == DOWN && coordinateX < toX) {
            robot.turnLeft();
        }
        if (direction == RIGHT && coordinateX < toX) {
            robot.stepForward();
        }
        if (direction == LEFT && coordinateX < toX) {
            robot.turnRight();
            robot.turnRight();
        }
        while (coordinateX < toX) {
            robot.turnRight();
            robot.stepForward();
            coordinateX++;
        }
            if (direction == UP && coordinateX > toX) {
                robot.turnLeft();
            }
            if (direction == DOWN && coordinateX > toX) {
                robot.turnRight();
            }
            if (direction == LEFT && coordinateX > toX) {
                robot.stepForward();
            }
            if (direction == RIGHT && coordinateX > toX) {
                robot.turnRight();
                robot.turnRight();
            }
            while (coordinateX > toX) {
                robot.turnLeft();
                robot.stepForward();
                coordinateX--;
            }
            if (direction == UP && coordinateY < toY) {
                robot.stepForward();
            }
            if (direction == DOWN && coordinateY < toY) {
                robot.turnLeft();
            }
            if (direction == RIGHT && coordinateY < toY) {
                robot.turnLeft();
            }
            if (direction == LEFT && coordinateY < toY) {
                robot.turnRight();
            }
            while (coordinateY < toY) {
                robot.stepForward();
                coordinateY++;
                if (coordinateY == toY) {
//                    coordinateY = toY;
                    break;
                }
            }
            if (direction == UP && coordinateY > toY) {
                robot.stepForward();
            }
            if (direction == DOWN && coordinateY > toY) {
                robot.turnRight();
                robot.turnRight();
            }
            if (direction == LEFT && coordinateY > toY) {
                robot.turnRight();
            }
            if (direction == RIGHT && coordinateY > toY) {
                robot.turnLeft();
            }
            while (coordinateY > toY) {
                robot.stepForward();
                coordinateY--;
                }
            }
        }









