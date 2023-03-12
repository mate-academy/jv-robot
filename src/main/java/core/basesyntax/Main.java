package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 4, 3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 2, -3);
        System.out.println(" Finished with coordinates " + robot.getX() + ";" + robot.getY());
    }
}
