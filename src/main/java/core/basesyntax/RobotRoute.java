package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //X direction moving
        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
            }
            while (toX > robot.getX()) {
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (toX < robot.getX()) {
                robot.stepForward();
            }
        }
        //Y direction moving
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (toY > robot.getY()) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (toY < robot.getY()) {
                robot.stepForward();
            }
        }

        //write your solution here
    }
}
