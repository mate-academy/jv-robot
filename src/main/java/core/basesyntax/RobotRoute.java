package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int diffOX = toX - robot.getX();
        int diffOY = toY - robot.getY();
        boolean move = true;
        while (move) {
            if (diffOY < 0 && robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
                if (robot.getDirection() == Direction.DOWN) {
                    move = false;
                }
            } else if (diffOY > 0 && robot.getDirection() != Direction.UP) {
                robot.turnLeft();
                if (robot.getDirection() == Direction.UP) {
                    move = false;
                }
            } else {
                move = false;
            }
        }
        for (int i = 0; i < Math.abs(diffOY); i++) {
            robot.stepForward();
        }
        move = true;
        while (move) {
            if (diffOX < 0 && robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
                if (robot.getDirection() == Direction.LEFT) {
                    move = false;
                }
            } else if (diffOX > 0 && robot.getDirection() != Direction.RIGHT) {
                robot.turnLeft();
                if (robot.getDirection() == Direction.RIGHT) {
                    move = false;
                }
            } else {
                move = false;
            }
        }
        for (int i = 0; i < Math.abs(diffOX); i++) {
            robot.stepForward();
        }
    }
}
