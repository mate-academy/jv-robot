package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        //write your solution here
        int robotX = robot.getX();
        int robotY = robot.getY();

        // To equal X coords
        if (robotX < toX) {
            robot.turnRight();
        } else if (robotX > toX) {
            robot.turnLeft();
        }
        while (robotX != toX) {
            robot.stepForward();
        }

        // To equal Y coords
        if (robotY < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if (robotY > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (robotY != toY) {
            robot.stepForward();
        }
    }
}
