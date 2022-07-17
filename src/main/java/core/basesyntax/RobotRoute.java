package core.basesyntax;

public class RobotRoute {

    private String route;

    public void moveRobot(Robot robot, int toX, int toY) {
        route = (toX < robot.getX()) ? "LEFT" : (toX > robot.getX()) ? "RIGHT" :
                (toY > robot.getY()) ? "UP" : "DOWN";

        while (robot.getDirection().name() != route) {
            robot.turnRight();
        }

        while (toX != robot.getX()) {
            robot.stepForward();
        }

        route = (toY > robot.getY()) ? "UP" : "DOWN";

        while (robot.getDirection().name() != route) {
            robot.turnLeft();
        }

        while (toY != robot.getY()) {
            robot.stepForward();
        }

    }
}
