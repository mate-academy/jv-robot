package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute.moveRobot (robot, 5, -3);
        System.out.println("Robot is located at position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Robot's direction is: " + robot.getDirection());


    }
}
