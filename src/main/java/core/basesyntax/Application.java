package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.LEFT, 6,-1);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, -1, 3);
    }
}
