package core.basesyntax;

import org.junit.Test;
import org.junit.Assert;

public class FieldXYTestWithNormalData {

    @Test
    public void robotShouldStayAtTheSamePosition() {
        int startX = 0;
        int startY = 0;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 0;
        int finalY = 0;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromFirstQuadrantToSecond() {
        int startX = 1;
        int startY = 1;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 2;
        int finalY = 2;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromFirstQuadrantToThird() {
        int startX = 1;
        int startY = 1;
        Robot robot = new Robot(Direction.RIGHT, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = -12;
        int finalY = -6;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromFirstQuadrantToFourth() {
        int startX = 1;
        int startY = 1;
        Robot robot = new Robot(Direction.DOWN, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = -9;
        int finalY = 14;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromSecondQuadrantToFirst() {
        int startX = 12;
        int startY = -4;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 12;
        int finalY = 16;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromSecondQuadrantToThird() {
        int startX = 5;
        int startY = -7;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = -3;
        int finalY = -5;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromSecondQuadrantToFourth() {
        int startX = 12;
        int startY = -4;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = -2;
        int finalY = 1;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromThirdQuadrantToFirst() {
        int startX = -2;
        int startY = -4;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 32;
        int finalY = 12;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromThirdQuadrantToSecond() {
        int startX = -2;
        int startY = -4;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 2;
        int finalY = -2;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromThirdQuadrantToFourth() {
        int startX = -2;
        int startY = -4;
        Robot robot = new Robot(Direction.LEFT, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = -23;
        int finalY = 1;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromFourthQuadrantToFirst() {
        int startX = -2;
        int startY = 4;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 23;
        int finalY = 1;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromFourthQuadrantToSecond() {
        int startX = -2;
        int startY = 4;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = 3;
        int finalY = -12;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }

    @Test
    public void goFromFourthQuadrantToThird() {
        int startX = -2;
        int startY = 4;
        Robot robot = new Robot(Direction.UP, startX, startY);
        FieldXY fieldXY = new FieldXY();
        int finalX = -3;
        int finalY = -1;

        fieldXY.moveRobot(robot, finalX, finalY);

        Assert.assertEquals("Wrong X coordinate", finalX, robot.getX());
        Assert.assertEquals("Wrong Y coordinate", finalY, robot.getY());
    }
}
