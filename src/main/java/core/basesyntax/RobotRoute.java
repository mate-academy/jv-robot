package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("Robot has already been at home!");
            return;
        } else {
            if (robot.getX() != toX) {
                moveToX(robot, toX);
            } else {
                moveOnlyToY(robot, toY);
            }
        }
        moveToY(robot, toY);
        System.out.println("Robot just have got home!");
    }

    // method to move robot along the X-axis
    private void moveToX(Robot robot, int toX) {
        int initialDistanceX = Math.abs(robot.getX() - toX);
        int currentDistanceX;
        robot.stepForward();
        currentDistanceX = Math.abs(robot.getX() - toX);
        if (robot.getX() != toX) {
            if (currentDistanceX == initialDistanceX) {
                robot.turnRight();
                robot.stepForward();
                currentDistanceX = Math.abs(robot.getX() - toX);
            }
            if (initialDistanceX < currentDistanceX) {
                robot.turnRight();
                robot.turnRight();
            }
            int steps = 0;
            while (steps < currentDistanceX) {
                robot.stepForward();
                steps++;
            }
        }
    }

    // method to move robot along the Y-axis, if X coordinates are right
    private void moveOnlyToY(Robot robot, int toY) {
        int initialDistanceY = Math.abs(robot.getY() - toY);
        int currentDistanceY = Math.abs(robot.getY() - toY);
        if (robot.getY() != toY) {
            if (initialDistanceY < currentDistanceY) {
                robot.turnRight();
                robot.turnRight();
            }
            int steps = 0;
            while (steps < currentDistanceY) {
                robot.stepForward();
                steps++;
            }
        }
    }

    // method to move robot along the X-axis
    private void moveToY(Robot robot, int toY) {
        int initialDistanceY = Math.abs(robot.getY() - toY);
        int currentDistanceY;
        robot.turnRight();
        currentDistanceY = Math.abs(robot.getY() - toY);
        if (robot.getY() != toY) {
            if (currentDistanceY == initialDistanceY) {
                robot.stepForward();
                currentDistanceY = Math.abs(robot.getY() - toY);
            }
            if (initialDistanceY < currentDistanceY) {
                robot.turnRight();
                robot.turnRight();
            }
            int steps = 0;
            while (steps < currentDistanceY) {
                robot.stepForward();
                steps++;
            }
        }
    }
}
