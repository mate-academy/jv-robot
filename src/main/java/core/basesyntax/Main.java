package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 40, 5);
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, 56, 8);
        System.out.println(robot.getX() + " : " + robot.getY());
    }
}
