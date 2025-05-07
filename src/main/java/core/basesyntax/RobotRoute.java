package core.basesyntax;

public class RobotRoute {
    private void moveAlongX(Robot robot, int toX) {
        while ((robot.getX() - toX) != 0) {
            if (robot.getX() - toX > 0) {
                switch (robot.getDirection()) {
                    case LEFT:
                        turnRightAndForward(robot,0);
                        break;
                    case DOWN:
                        turnRightAndForward(robot,1);
                        break;
                    case RIGHT:
                        turnRightAndForward(robot,2);
                        break;
                    case UP:
                        turnRightAndForward(robot,3);
                        break;
                    default:
                        break;
                }
            } else {
                switch (robot.getDirection()) {
                    case RIGHT:
                        turnRightAndForward(robot,0);
                        break;
                    case UP:
                        turnRightAndForward(robot,1);
                        break;
                    case LEFT:
                        turnRightAndForward(robot,2);
                        break;
                    case DOWN:
                        turnRightAndForward(robot,3);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void moveAlongY(Robot robot, int toY) {
        while ((robot.getY() - toY) != 0) {
            if (robot.getY() - toY > 0) {
                switch (robot.getDirection()) {
                    case DOWN:
                        turnRightAndForward(robot, 0);
                        break;
                    case RIGHT:
                        turnRightAndForward(robot, 1);
                        break;
                    case UP:
                        turnRightAndForward(robot, 2);
                        break;
                    case LEFT:
                        turnRightAndForward(robot, 3);
                        break;
                    default:
                        break;
                }
            } else {
                switch (robot.getDirection()) {
                    case UP:
                        turnRightAndForward(robot, 0);
                        break;
                    case LEFT:
                        turnRightAndForward(robot, 1);
                        break;
                    case DOWN:
                        turnRightAndForward(robot, 2);
                        break;
                    case RIGHT:
                        turnRightAndForward(robot, 3);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void turnRightAndForward(Robot robot, int turnsNumber) {
        for (int i = 0; i < turnsNumber; i++) {
            robot.turnRight();
        }
        robot.stepForward();
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        moveAlongX(robot, toX);
        moveAlongY(robot, toY);
    }
}
