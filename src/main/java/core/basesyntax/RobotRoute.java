package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        int xdif = toX - robot.getX();
        int ydif = toY - robot.getY();

        if (ydif > 0) {
            rotate(robot, Direction.UP);
            moveForward(robot, ydif);
        } else if (ydif < 0) {
            rotate(robot, Direction.DOWN);
            moveForward(robot, ydif);
        }

        if (xdif > 0) {
            rotate(robot, Direction.RIGHT);
            moveForward(robot, xdif);
        } else if (xdif < 0) {
            rotate(robot, Direction.LEFT);
            moveForward(robot, xdif);
        }
    }
    
    private void moveForward(Robot robot, int dif) {
        for (int i = 0; i < Math.abs(dif); i++) {
            robot.stepForward();
        }
    }

    private void rotate(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnLeft();
        }
    }
}
