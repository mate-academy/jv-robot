package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 32, 4);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 15, 12);
    }
}
