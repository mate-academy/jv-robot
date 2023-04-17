package core.basesyntax;
import java.lang.Math;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (robot.getX() == toX && robot.getY() == toY) {
            return;
        }

        coverSegment(getDirectionsX(toX, robot.getX()), robot, numberOfSteps(toX, robot.getX()));
        coverSegment(getDirectionsY(toY, robot.getY()), robot, numberOfSteps(toY, robot.getY()));
    }

    private void coverSegment(Direction moveToDirection, Robot robot, int steps){
        if (moveToDirection != null) {
            while (!robot.getDirection().equals(moveToDirection)) {
                robot.turnLeft();
            }
            for (int i = steps; i > 0; i--) {
                robot.stepForward();
            }
        }
    }

    private int numberOfSteps(int toCoordinate, int curCoordinate) {
        return Math.abs(toCoordinate - curCoordinate);
    }

    private Direction getDirectionsX(int toX, int curX) {
        return (toX < curX ? Direction.LEFT : (toX > curX ? Direction.RIGHT : null));
    }

    private Direction getDirectionsY(int toY, int curY) {
        return (toY < curY ? Direction.DOWN : (toY > curY ? Direction.UP : null));
    }
}
