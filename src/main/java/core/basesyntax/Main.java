package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);

        RobotRoute route = new RobotRoute();

        int targetX = 3;
        int targetY = -2;

        route.moveRobot(robot, targetX, targetY);

        System.out.println("Final position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Final direction: " + robot.getDirection());
    }
}
