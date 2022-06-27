package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Robot Johny = new Robot(Direction.RIGHT, 2, 5);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(Johny, -5, -10);
    }
}