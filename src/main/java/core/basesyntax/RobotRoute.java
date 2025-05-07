package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int startCoordinateX = robot.getX(); //-2
        int startCoordinateY = robot.getY(); //4
        int differenceX = Math.abs(robot.getX() - toX);//1
        int differenceY = Math.abs(robot.getY() - toY);//5
        robot.stepForward();
        if (startCoordinateX != robot.getX() && startCoordinateY == robot.getY()) {
            if (differenceX < Math.abs(robot.getX() - toX)) {
                robot.turnRight();
                robot.turnRight();
                robot.stepForward();
                for (int x = 0; x < differenceX; x++) {
                    robot.stepForward();
                }
            } else {
                for (int x = 1; x < differenceX; x++) {
                    robot.stepForward();
                }
            }
        } else {
            if (differenceY < Math.abs(robot.getY() - toY)) {
                robot.turnRight();
                robot.turnRight();
                robot.stepForward();
                for (int y = 0; y < differenceY; y++) {
                    robot.stepForward();
                }
            } else {
                for (int y = 1; y < differenceY; y++) {
                    robot.stepForward();
                }
            }
        }
        robot.turnRight();
        robot.stepForward();
        if (toX != robot.getX() || toY == robot.getY()) {
            if (differenceX < Math.abs(robot.getX() - toX)) {
                robot.turnRight();
                robot.turnRight();
                robot.stepForward();
                for (int x = 0; x < differenceX; x++) {
                    robot.stepForward();
                }
            } else {
                for (int x = 1; x < differenceX; x++) {
                    robot.stepForward();
                }
            }
        } else {
            if (differenceY < Math.abs(robot.getY() - toY)) {
                robot.turnRight();
                robot.turnRight();
                robot.stepForward();
                for (int y = 0; y < differenceY; y++) {
                    robot.stepForward();
                }
            } else {
                for (int y = 1; y < differenceY; y++) {
                    robot.stepForward();
                }
            }
        }
    }
}
