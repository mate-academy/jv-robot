package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        RobotRoute robotRoute = new RobotRoute();
        Robot robot = new Robot(Direction.DOWN, 12, 4);
        robotRoute.moveRobot(robot, -22, 2);
    }
}
