package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, -3, 4);
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, 0,0);
    }
}
