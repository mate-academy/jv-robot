package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // 1. choose direction where to go (X's)
        chooseDirectionX(robot, toX);
        // 2. go
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        // 3. repeat 1 & 2 (Y's)
        chooseDirectionY(robot, toY);
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public void chooseDirectionX(Robot robot, int toX) {
        // X
        if (robot.getX() < toX) {
            // if myX < toX | turn RIGHT
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (robot.getX() > toX) {
            // if myX > toX | turn LEFT
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }
    }

    public void chooseDirectionY(Robot robot, int toY) {
        // Y
        if (robot.getY() > toY) {
            // if myY > toY | turn DOWN
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if (robot.getY() < toY) {
            // if myY < toY | turn UP
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
    }
}
