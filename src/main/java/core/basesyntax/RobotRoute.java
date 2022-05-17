package core.basesyntax;

import java.lang.reflect.Field;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        try {
            Field f1 = robot.getClass().getField("coordinateX");
            f1.setAccessible(true);
            f1.set(robot, toX);
            Field f2 = robot.getClass().getField("coordinateY");
            f2.setAccessible(true);
            f2.set(robot, toY);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
