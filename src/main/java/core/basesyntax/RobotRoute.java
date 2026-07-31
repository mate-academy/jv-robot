package core.basesyntax;

public class RobotRoute {

    public void faceRobot(Robot robot, Direction needDirection) {
        if (robot.getDirection() == needDirection) {
            return;
        }
        if ((robot.getDirection() == Direction.UP && needDirection == Direction.DOWN)
                || (robot.getDirection() == Direction.DOWN && needDirection == Direction.UP)
                || (robot.getDirection() == Direction.LEFT && needDirection == Direction.RIGHT)
                || (robot.getDirection() == Direction.RIGHT && needDirection == Direction.LEFT)) {
            robot.turnLeft();
            robot.turnLeft();
            return;
        }
        if ((robot.getDirection() == Direction.UP && needDirection == Direction.RIGHT)
                || (robot.getDirection() == Direction.RIGHT && needDirection == Direction.DOWN)
                || (robot.getDirection() == Direction.DOWN && needDirection == Direction.LEFT)
                || (robot.getDirection() == Direction.LEFT && needDirection == Direction.UP)) {
            robot.turnRight();
        } else {
            robot.turnLeft();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {

        int stepsX = toX - robot.getX();
        if (robot.getX() != toX) {
            faceRobot(robot, stepsX > 0 ? Direction.RIGHT : Direction.LEFT);
            int stepXAbs = Math.abs(stepsX);
            for (int i = 0; i < stepXAbs; i++) {
                robot.stepForward();
            }
        }

        int stepsY = toY - robot.getY();
        if (robot.getY() != toY) {
            faceRobot(robot, stepsY > 0 ? Direction.UP : Direction.DOWN);
            int stepsYAbs = Math.abs(stepsY);
            for (int i = 0; i < stepsYAbs; i++) {
                robot.stepForward();
            }
        }
    }
}
