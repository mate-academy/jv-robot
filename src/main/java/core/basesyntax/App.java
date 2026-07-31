package core.basesyntax;

public class App {

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.LEFT, 5, -3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, -80, -20);

    }
}
