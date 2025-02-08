package core.basesyntax;

public class RobotRoute {
    private void turnRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (robot.getX() < toX) {
            turnRobot(robot, Direction.RIGHT);
        } else if (robot.getX() > toX) {
            turnRobot(robot, Direction.LEFT);
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (robot.getY() < toY) {
            turnRobot(robot, Direction.UP);
        } else if (robot.getY() > toY) {
            turnRobot(robot, Direction.DOWN);
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        RobotRoute robotRoute = new RobotRoute();
        robotRoute.moveRobot(robot, 5, -3);
        System.out.println("Robot at (" + robot.getX() + "," + robot.getY() + ")");
    }
}
