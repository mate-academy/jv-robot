package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startX = robot.getX();
        int startY = robot.getY();
        int stepX = Math.abs(startX - toX);
        int stepY = Math.abs(startY - toY);

        if (startX > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            moveForward(robot, stepX);
            if (startY > toY) {
                robot.turnLeft();
                moveForward(robot, stepY);
            } else {
                robot.turnRight();
                moveForward(robot, stepY);
            }

        } else if (startX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            moveForward(robot, stepX);
            if (startY > toY) {
                robot.turnRight();
                moveForward(robot, stepY);
            } else if (startY < toY) {
                robot.turnLeft();
                moveForward(robot, stepY);
            }
        } else {
            if (startY > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                moveForward(robot, stepY);
            } else if (startY < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                moveForward(robot, stepY);
            }
        }
    }

    public void moveForward(Robot robot, int steps) {
        while (steps > 0) {
            robot.stepForward();
            steps--;
        }
    }
}
