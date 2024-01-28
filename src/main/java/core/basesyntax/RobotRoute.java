package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        faceCorrectWayToX(robot.getX(), toX, robot);
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        faceCorrectWayToY(robot.getY(), toY, robot);
        while (robot.getY() != toY) {
            robot.stepForward();
        }

    }

    private void faceCorrectWayToX(int currentPos, int toPos, Robot robot) {
        if (currentPos > toPos) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if (currentPos < toPos) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
    }

    private void faceCorrectWayToY(int currentPos, int toPos, Robot robot) {
        if (currentPos > toPos) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (currentPos < toPos) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
    }
}
