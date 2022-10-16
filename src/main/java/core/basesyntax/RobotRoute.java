package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int actualX = robot.getX();
        int actualY = robot.getY();

        if (actualX > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        } else if (actualX < toX) {
                switch (robot.getDirection()) {
                    case UP:
                        robot.turnRight();
                        break;
                    case LEFT:
                        robot.turnRight();
                        robot.turnRight();
                        break;
                    case DOWN:
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
        }
        while (actualX != toX) {
            robot.stepForward();
            actualX = robot.getX();
        }
        if (actualY < toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        } else if (actualY > toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
        while (actualY != toY) {
            robot.stepForward();
            actualY = robot.getY();
        }
    }
}
