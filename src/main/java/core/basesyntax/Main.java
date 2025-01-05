package core.basesyntax;
import static core.basesyntax.Direction.*;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot(UP, -6,3);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot1, -10, 5);
    }
}
