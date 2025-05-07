package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.RIGHT, 3, -2);
        RobotRoute.moveRobot(robot, -4, 3);
    }
}
