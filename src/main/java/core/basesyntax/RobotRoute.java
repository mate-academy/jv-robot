package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongX(robot, toX);
        moveAlongY(robot, toY);
    }

    private void moveAlongX(Robot robot, int toX) {
        int numberOfStepsByX = Math.abs(robot.getX() - toX);
        //move along x-axis
        if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP :
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default :
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case DOWN :
                    robot.turnLeft();
                    break;
                case LEFT :
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case UP :
                    robot.turnRight();
                    break;
                default :
                    break;
            }
        }

        for (int i = 0; i < numberOfStepsByX; i++) {
            robot.stepForward();
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        int numberOfStepsByY = Math.abs(robot.getY() - toY);

        //move along y-axis
        if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case RIGHT :
                    robot.turnRight();
                    break;
                case LEFT :
                    robot.turnLeft();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default :
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case DOWN :
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT :
                    robot.turnRight();
                    break;
                default :
                    break;
            }
        }

        for (int i = 0; i < numberOfStepsByY; i++) {
            robot.stepForward();
        }
    }
}
