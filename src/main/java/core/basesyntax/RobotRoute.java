package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        while (toX != robot.getX() || toY != robot.getY()) {
            System.out.println("Robot X = " + robot.getX() + " Y = " + robot.getY());

            if (toY > robot.getY()) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (toY < robot.getY()) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }

            if (toX > robot.getX()) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (toX < robot.getX()) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }
        }
    }
}
