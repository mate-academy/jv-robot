package core.basesyntax;
import java.lang.Math;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        Direction moveToDirection = getDirectionsX(toX, robot.getX());
//        int steps = numberOfSteps(toX, robot.getX());
        if (moveToDirection != null) {
            while (!robot.getDirection().equals(moveToDirection)) {
                robot.turnLeft();
            }
            int steps = numberOfSteps(toX, robot.getX());
            for (int i = steps; i > 0; i--) {
                robot.stepForward();
            }
        }

        moveToDirection = getDirectionsY(toY, robot.getY());
//        steps = numberOfSteps(toY, robot.getY());
        if (moveToDirection != null) {
            while (!robot.getDirection().equals(moveToDirection)) {
                robot.turnLeft();
            }
            int steps = numberOfSteps(toY, robot.getY());
            for (int i = steps; i > 0; i--) {
                robot.stepForward();
            }
        }
    }

    private void coverSegment(Direction moveToDirection, Robot robot, int toCoordinate, int steps){
        if (moveToDirection != null) {
            while (!robot.getDirection().equals(moveToDirection)) {
                robot.turnLeft();
            }
            //int steps = numberOfSteps(toCoordinate, robot.getX());
            for (int i = steps; i > 0; i--) {
                robot.stepForward();
            }
        }
    }

    private int numberOfSteps(int toCoordinate, int curCoordinate) {
        return Math.abs(toCoordinate - curCoordinate);
    }

    private Direction getDirectionsX(int toX, int curX) {
        if
        return (toX < curX ? Direction.LEFT : (toX > curX ? Direction.RIGHT : null));
    }

    private Direction getDirectionsY(int toY, int curY) {
        return (toY < curY ? Direction.DOWN : (toY > curY ? Direction.UP : null));
    }
}
