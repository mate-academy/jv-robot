package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int currentPositionX = robot.getX();
        int currentPostionY = robot.getY();

        faceX(robot,currentPositionX,toX);
        faceY(robot,currentPostionY,toY);

    }

    private void faceX(Robot robot, int position, int toX) {
        while (position < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
            position = robot.getX();
        }
        while (position > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
            position = robot.getX();
        }
    }

    private void faceY(Robot robot, int position, int toY) {
        while (position < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
            position = robot.getY();
        }
        while (position > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            robot.stepForward();
            position = robot.getY();
        }
    }
}
