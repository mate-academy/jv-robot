package core.basesyntax;

public class Main {
  public static void main(String[] args) {
    Robot robot = new Robot( Direction.UP, 0, 0); // Start at (0,0) facing UP
    RobotRoute route = new RobotRoute();
    route.moveRobot(robot, 9, 7); // Move robot to (5, 10)
  }
}
