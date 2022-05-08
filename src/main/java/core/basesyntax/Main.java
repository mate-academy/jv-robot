package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        Robot testRobot = new Robot(Direction.LEFT, 5, 0);
        robotRoute.moveRobot(testRobot, -4, 0);
        System.out.println(testRobot.getX() + " " + testRobot.getY());
    }
}
