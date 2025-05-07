package core.basesyntax.main;

import core.basesyntax.Direction;
import core.basesyntax.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 5, 5);
        System.out.println("Robot final position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Robot final direction: " + robot.getDirection());
    }
}
