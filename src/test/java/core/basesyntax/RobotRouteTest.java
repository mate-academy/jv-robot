package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class RobotRouteTest {
  @Test
  public void robotShouldStayAtTheSamePosition() {
    int startX = 0;
    int startY = 0;
    Robot robot = new Robot(Direction.LEFT, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 0;
    int expectedY = 0;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromFirstQuadrantToSecond() {
    int startX = 1;
    int startY = 1;
    Robot robot = new Robot(Direction.LEFT, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 7;
    int expectedY = -3;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromFirstQuadrantToThird() {
    int startX = 1;
    int startY = 1;
    Robot robot = new Robot(Direction.RIGHT, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = -12;
    int expectedY = -6;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromFirstQuadrantToFourth() {
    int startX = 1;
    int startY = 1;
    Robot robot = new Robot(Direction.DOWN, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = -9;
    int expectedY = 14;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromSecondQuadrantToFirst() {
    int startX = 12;
    int startY = -4;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 12;
    int expectedY = 16;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromSecondQuadrantToThird() {
    int startX = 5;
    int startY = -7;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = -3;
    int expectedY = -5;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromSecondQuadrantToFourth() {
    int startX = 12;
    int startY = -4;
    Robot robot = new Robot(Direction.LEFT, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = -2;
    int expectedY = 1;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromThirdQuadrantToFirst() {
    int startX = -2;
    int startY = -4;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 32;
    int expectedY = 12;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromThirdQuadrantToSecond() {
    int startX = -2;
    int startY = -4;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 2;
    int expectedY = -2;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromThirdQuadrantToFourth() {
    int startX = -2;
    int startY = -4;
    Robot robot = new Robot(Direction.LEFT, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = -23;
    int expectedY = 1;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromFourthQuadrantToFirst() {
    int startX = -2;
    int startY = 4;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 23;
    int expectedY = 1;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromFourthQuadrantToSecond() {
    int startX = -2;
    int startY = 4;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = 3;
    int expectedY = -12;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }

  @Test
  public void goFromFourthQuadrantToThird() {
    int startX = -2;
    int startY = 4;
    Robot robot = new Robot(Direction.UP, startX, startY);
    RobotRoute robotRoute = new RobotRoute();
    int expectedX = -3;
    int expectedY = -1;

    robotRoute.moveRobot(robot, expectedX, expectedY);
    int actualX = robot.getX();
    int actualY = robot.getY();
    Assert.assertEquals(String.format("Wrong X coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedX, actualX);
    Assert.assertEquals(String.format("Wrong Y coordinate with start position x = %d and y = %d\n",
      startX, startY), expectedY, actualY);
  }
}
