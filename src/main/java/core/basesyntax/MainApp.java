package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Robot johny = new Robot(Direction.RIGHT, 2, 5);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(johny, -4, -13);
    }
}
