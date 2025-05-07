package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute robotRoute = new RobotRoute();
        int toX = 5;
        int toY = 3;

        System.out.println("Initial position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Moving to: (" + toX + ", " + toY + ")");

        robotRoute.moveRobot(robot, toX, toY);

        System.out.println("Final position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Direction: " + robot.getDirection());
    }
}


