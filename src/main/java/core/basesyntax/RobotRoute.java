
package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        Direction directionToX = robot.getX() > toX ? Direction.LEFT : Direction.RIGHT;
        Direction directionToY = robot.getY() > toY ? Direction.DOWN : Direction.UP;
        if ((Math.abs(giveNumber(directionToX) - giveNumber(robot.getDirection())) != 2)
                && ((giveNumber(directionToY) - giveNumber(robot.getDirection()) != 0))) {
            toTurn(giveNumber(robot.getDirection()), giveNumber(directionToX), robot, directionToX);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            toTurn(giveNumber(robot.getDirection()), giveNumber(directionToY), robot, directionToY);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else {
            toTurn(giveNumber(robot.getDirection()), giveNumber(directionToY), robot, directionToY);
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            toTurn(giveNumber(robot.getDirection()), giveNumber(directionToX), robot, directionToX);
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
    }

    private int giveNumber(Direction direction) {
        switch (direction) {
            case UP:
                return 1;
            case RIGHT:
                return 2;
            case DOWN:
                return 3;
            case LEFT:
                return 4;
            default:
                return 0;
        }
    }

    private void toTurn(int start, int finish, Robot robot, Direction finishDirection) {
        if ((finish - start) == 0) {
            return;
        }
        if ((finish - start) == 1 || (finish - start) == -3) {
            while (robot.getDirection() != finishDirection) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != finishDirection) {
                robot.turnLeft();
            }
        }
    }
}
