package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //go x
        while (toX != robot.getX()) {
            if (toX < robot.getX()) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }
        //go y
        while (toY != robot.getY()) {
            if (toY < robot.getY()) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 4, 7);
        RobotRoute robotRoute = new RobotRoute();
        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
        robotRoute.moveRobot(robot, 1, 1);
        System.out.println(robot.getX() + " " + robot.getY() + " " + robot.getDirection());
    }
}
