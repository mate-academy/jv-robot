package core.basesyntax;

import java.util.function.Consumer;
import java.util.function.Function;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        alignCoordinate(Robot::getX, robot, Robot::faceLeft, Robot::faceRight, toX);
        alignCoordinate(Robot::getY, robot, Robot::faceDown, Robot::faceUp, toY);
    }

    private void alignCoordinate(Function<Robot, Integer> robotCoordinateFunction,
                                 Robot robot,
                                 Consumer<Robot> faceNegativeConsumer,
                                 Consumer<Robot> facePositiveConsumer,
                                 int coordinate) {
        int robotCoordinate = robotCoordinateFunction.apply(robot);
        while (robotCoordinate != coordinate) {
            if (robotCoordinate > coordinate) {
                faceNegativeConsumer.accept(robot);
            } else {
                facePositiveConsumer.accept(robot);
            }
            robot.stepForward();
            robotCoordinate = robotCoordinateFunction.apply(robot);
        }
    }
}
