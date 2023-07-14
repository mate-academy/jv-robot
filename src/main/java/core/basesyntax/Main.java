package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 6, 6);
        RobotRoute robotRoute = new RobotRoute();
        int toX = -4;
        int toY = -6;
        System.out.println("Robot is on position (X: " + robot.getX()
                + ", Y: " + robot.getY() + ")");
        robotRoute.moveRobot(robot, toX, toY);
        System.out.println("Robot is on position: X: " + robot.getX() + ", Y: "
                + robot.getY() + ", looking " + robot.getDirection());
    }
}
