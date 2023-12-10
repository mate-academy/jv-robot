package core.basesyntax;

import org.junit.Test;
import org.junit.Assert;

public class FieldXYTestWithExtremeData {

    @Test
    public void testWithMaxValue() {
        int startX = 0;
        int startY = 0;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        RobotRoute fieldXY = new RobotRoute();
        int finalX = Integer.MAX_VALUE;
        int finalY = Integer.MAX_VALUE;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void testWithMinValue() {
        int startX = 0;
        int startY = 0;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        RobotRoute fieldXY = new RobotRoute();
        int finalX = Integer.MIN_VALUE;
        int finalY = Integer.MIN_VALUE;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void testFromMaxValueToMinValue() {
        int startX = Integer.MAX_VALUE;
        int startY = Integer.MAX_VALUE;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        RobotRoute fieldXY = new RobotRoute();
        int finalX = Integer.MIN_VALUE;
        int finalY = Integer.MIN_VALUE;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }
}

