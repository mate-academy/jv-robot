package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.DOWN, -8, 6);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, -2, 1);
        System.out.println("X - " + robot.getX() + " Y - " + robot.getY());
    }
}
