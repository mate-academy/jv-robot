package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.LEFT, -3, -4);
        robot.turnLeft();
        RobotRoute.moveRobot (robot, 2, 5);
        System.out.println("Robot is located at position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Robot's direction is: " + robot.getDirection());
    }
}
