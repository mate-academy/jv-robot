package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        changeDirection(true, robot.getX(), toX, robot);
        moveToTargetX(robot, toX);
        changeDirection(false, robot.getY(), toY, robot);
        moveToTargetY(robot, toY);
    }

    private void changeDirection(boolean forX, int currentPos, int target, Robot robot) {
        Direction trueDirection;
        if (currentPos >= target) {
            trueDirection = forX ? Direction.LEFT : Direction.DOWN;
        } else {
            trueDirection = forX ? Direction.RIGHT : Direction.UP;
        }

        while (!robot.getDirection().equals(trueDirection)) {
            turnLogic(robot, trueDirection);
        }
    }

    private void turnLogic(Robot robot, Direction trueDirection) {
        if (robot.getDirection() == Direction.UP && trueDirection == Direction.RIGHT) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.RIGHT && trueDirection == Direction.DOWN) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.DOWN && trueDirection == Direction.LEFT) {
            robot.turnRight();
        } else if (robot.getDirection() == Direction.LEFT && trueDirection == Direction.UP) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
    }

    private void moveToTargetX(Robot robot, int target) {
        while (robot.getX() != target) {
            robot.stepForward();
        }
    }

    private void moveToTargetY(Robot robot, int target) {
        while (robot.getY() != target) {
            robot.stepForward();
        }
    }
}
