package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {

        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
                System.out.println(robot);
            }
            while (toX != robot.getX()) {
                robot.stepForward();
                System.out.println(robot);
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
                System.out.println(robot);
            }
            while (toX != robot.getX()) {
                robot.stepForward();
                System.out.println(robot);
            }
        }

        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
                System.out.println(robot);
            }
            while (toY != robot.getY()) {
                robot.stepForward();
                System.out.println(robot);
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
                System.out.println(robot);
            }
            while (toY != robot.getY()) {
                robot.stepForward();
                System.out.println(robot);
            }
        }
    }
}



