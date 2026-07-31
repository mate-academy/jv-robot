package core.basesyntax;

public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute route = new RobotRoute();

        int targetX = 3;
        int targetY = 4;

        route.moveRobot(robot, targetX, targetY);
        System.out.println("The robot is located on: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("The robot looks in the direction: " + robot.getDirection());
    }
}
