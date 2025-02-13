package core.basesyntax;

public class main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 0, 0);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 3, 2);
        System.out.println("Robot final position: X = " + robot.getX() + ", Y = " + robot.getY());
    }
}

