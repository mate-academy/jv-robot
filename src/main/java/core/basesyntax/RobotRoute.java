package core.basesyntax;

import java.util.function.Consumer;
import java.util.function.Function;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        alignCoordinate(Robot::getX, Robot::faceLeft, robot, toX);
        alignCoordinate(Robot::getY, Robot::faceDown, robot, toY);
    }

    private void alignCoordinate(Function<Robot, Integer> robotCoordinateFunction,
                                 Consumer<Robot> faceNegativeConsumer,
                                 Robot robot,
                                 int coordinate) {
        int robotCoordinate = robotCoordinateFunction.apply(robot);
        while (robotCoordinate != coordinate) {
            faceNegativeConsumer.accept(robot);
            if (robotCoordinate < coordinate) {
                robot.turnAround();
            }
            robot.stepForward();
            robotCoordinate = robotCoordinateFunction.apply(robot);
        }
    }
}
