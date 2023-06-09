package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 3, -2);
//        System.out.println("Direction: " + robot.getDirection() + ", X = " + robot.getX() + ", Y = " + robot.getY());

        RobotRoute.moveRobot(robot, -4, 3);
//        System.out.println("Direction: " + robot.getDirection() + ", X = " + robot.getX() + ", Y = " + robot.getY());
    }
}
